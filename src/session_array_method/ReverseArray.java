package session_array_method;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        do {
            System.out.println("Enter number of element: ");
            size = scanner.nextInt();
        } while (size  <= 0 || size > 20);
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter value of element "+(i+1)+":");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Array after add value is: ");
        for (int n :
                arr) {
            System.out.print(n+" ");
        }
        System.out.println();
        System.out.println("Reverse array:");
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[size - i - 1];
            arr[size - i - 1] = temp;

        }
        for (int n :
                arr) {
            System.out.print(n+" ");
        }


    }
}
