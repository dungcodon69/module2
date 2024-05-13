package session_array_method;

import java.util.Scanner;

public class LargestElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println();
        int max = array[0];
        int max_idx = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max){
                max = array[j];
                max_idx = j;
            }
        }
        System.out.println("The largest element in the list is: " + max + " ,at index " + max_idx);

    }
}
