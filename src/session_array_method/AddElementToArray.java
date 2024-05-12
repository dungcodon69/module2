package session_array_method;

import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 5; i++) {
            arr[i] = i + 5;
        }
        for (int n :
                arr) {
            System.out.print(n+" ");
        }
        System.out.println();
        System.out.println("Enter value want to add: ");
        int value = scanner.nextInt();
        int index_insert = -1;
        do {
            System.out.println("Enter position index want to add");
            index_insert = scanner.nextInt();
        } while (index_insert <= -1 || index_insert >= arr.length);

        int temp = arr[index_insert];

        for (int i = index_insert+1; i < arr.length; i++) {
            int data = arr[i];
            arr[i] = temp;
            temp = data;
        }

        arr[index_insert] = value;

        System.out.println("Array:");
        for (int n :
                arr) {
            System.out.print(n+" ");
        }

    }
}
