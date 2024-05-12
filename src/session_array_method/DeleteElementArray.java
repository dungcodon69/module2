package session_array_method;

import java.util.Scanner;

public class DeleteElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value element "+i+" :");
            arr[i] = scanner.nextInt();
        }
        for (int n :
                arr) {
            System.out.print(n+" ");
        }
        System.out.println();
        System.out.println("Enter number to delete:");
        int numberDelete = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (numberDelete == arr[i]){
                for (int j = i; j < arr.length - 1 ; j++) {
                    arr[j] = arr[j+1];
                }
                arr[size - 1] = 0;
                System.out.println("Deleted");
                break;
            }

        }
        System.out.println("Array:");
        for (int n :
                arr) {
            System.out.print(n + " ");
        }

    }
}
