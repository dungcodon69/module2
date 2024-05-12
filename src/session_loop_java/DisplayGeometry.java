package session_loop_java;

import java.util.Scanner;

public class DisplayGeometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = 7;
        int height = 5;
        int choice = -1;
        while (choice != 0){
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (top-left square)");
            System.out.println("3. Print the square triangle (top-right square)");
            System.out.println("4. Print the square triangle (bottom-left square)");
            System.out.println("5. Print the square triangle (bottom-right square)");
            System.out.println("6. Print isosceles triangle ");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = height; i > 0; i--) {
                        for (int j = 0; j < i ; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = height; i > 0; i--) {
                        int n = i;
                        while (n < height){
                            System.out.print(" ");
                            n++;
                        }
                        for (int j = 0; j < i ; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    for (int i = 0; i < height; i++) {
                        int n = i;
                        while (n < height - 1){
                            System.out.print(" ");
                            n++;
                        }
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    for (int i = 1; i <= height; i++) {
                        for (int j = height; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < i * 2 - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Not valid");
            }
        }
    }
}
