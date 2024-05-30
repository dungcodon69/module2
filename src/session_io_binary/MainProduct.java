package session_io_binary;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProduct {
    static final String PATH = "src/session_io_binary/product.txt";
    public static void main(String[] args) {
        List<Product> list = readFile();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Product---");
        int choice = -1;
        while (choice != 0){
            System.out.println("1. Add");
            System.out.println("2. Display");
            System.out.println("3. Search");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("ID: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Price: ");
                    double price = Double.parseDouble(scanner.nextLine());
                    System.out.println("Brand: ");
                    String brand = scanner.nextLine();
                    System.out.println("Description: ");
                    String description = scanner.nextLine();
                    Product product = new Product(id,name,price,brand,description);
                    list.add(product);
                    writeFile(list);
                    break;
                case 2:
                    if (list.isEmpty()){
                        System.out.println("No information");
                    } else {
                        for (Product p : list){
                            System.out.println(p);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter code: ");
                    int code = Integer.parseInt(scanner.nextLine());
                    for (Product p : list){
                        if (p.getCode() == code){
                            System.out.println("Found");
                            System.out.println(p);
                            break;
                        }

                        System.out.println("Not found");
                    }

                    break;
            }
        }



    }
    private static List<Product> readFile() {
        List<Product> list = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(PATH);
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            System.out.println("Error when read file " + e.getMessage());
        }
        return list;
    }

    private static void writeFile(List<Product> product) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(PATH)){
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(product);
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
