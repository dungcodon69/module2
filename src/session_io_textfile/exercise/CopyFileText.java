package session_io_textfile.exercise;

import java.io.*;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter source file path: ");
        String sourcePath = scanner.nextLine();
        System.out.println("Enter target file path:  ");
        String targetPath = scanner.nextLine();
        try{
            File sourceFile = new File(sourcePath);
            File targetFile = new File(targetPath);
            if (!sourceFile.exists() || !targetFile.exists()) throw new FileNotFoundException();

            BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile));
            PrintWriter printWriter = new PrintWriter(targetFile);
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                printWriter.println(line);
            }
            bufferedReader.close();
            printWriter.close();
            System.out.println("Success");


        } catch (Exception e){
            System.out.println("Source file or target file not found! Try again !");
        }
    }
}
