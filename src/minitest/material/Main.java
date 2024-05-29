package minitest.material;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MaterialManager materialManager = new MaterialManager();
        System.out.println("---Welcome Material Manager---");
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0){
            System.out.println("1. Add material");
            System.out.println("2. Update material");
            System.out.println("3. Delete material");
            System.out.println("4. Display all material");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            try{
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e){
                System.out.println("You need enter a number!");
            }

            switch (choice){
                case 1:
                    System.out.println("Choose one of this material: ");
                    System.out.println("1. CrispyFlour");
                    System.out.println("2. Meat");
                    int typeMaterial = Integer.parseInt(scanner.nextLine());
                    if (typeMaterial < 0 || typeMaterial > 2){
                        System.out.println("Not found that option!");
                        break;
                    }
                    Material result = chooseMaterial(typeMaterial);
                    if (result!=null){
                        materialManager.addNewMaterial(result);
                        System.out.println("Success");
                    } else {
                        System.out.println("Not Success");
                    }
                    break;
                case 4:
                    System.out.println("---Display All Material---");
                    List<Material> allMaterial = materialManager.getAllMaterial();
                    for (Material m : allMaterial){
                        System.out.println(m);
                    }
                    break;
                case 0:
                    System.out.println("Exit!");
                    System.exit(0);
            }
        }
    }

    private static Material chooseMaterial(int typeMaterial) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Enter information of material---");
        System.out.println("ID: ");
        String id = scanner.nextLine();
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Cost: ");
        int cost = Integer.parseInt(scanner.nextLine());
        if (typeMaterial == 1){
            System.out.println("Quantity: ");
            int quantity = Integer.parseInt(scanner.nextLine());
            return new CrispyFlour(id,name, LocalDate.now(),cost,quantity);
        }
        else if(typeMaterial == 2){
            System.out.println("Weight: ");
            int weight = Integer.parseInt(scanner.nextLine());
            return new Meat(id,name,LocalDate.now(),cost,weight);
        }
        return null;
    }


}
