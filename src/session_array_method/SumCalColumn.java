package session_array_method;

import java.util.Scanner;

public class SumCalColumn {
    public static void main(String[] args) {
        double[][] arr = {
                {1,2,3},
                {4,5,6},
                {9.9,8,7}
        };
        System.out.println("Two Dimensional Array");
        for (double[] a :
                arr) {
            for (double ar :
                    a) {
                System.out.print(ar+" | ");
            }
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sum of column (from 0): ");
        int column = scanner.nextInt();
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][column];
        }
        System.out.println(sum);
    }
}
