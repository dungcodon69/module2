package session_array_method;

import java.util.Scanner;

public class MaxInTwoDimensionalArray {
    public static void printArray(double[][] arr){
        for (double[] a :
                arr) {
            for (double ar :
                    a) {
                System.out.print(ar+" | ");
            }
            System.out.println();
        }
    }
    public static void findMaxNumber(double[][] arr){
        int maxRow = 0;
        int maxColumn = 0;
        double maxNumber = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxNumber){
                    maxRow = i+1;
                    maxColumn = j+1;
                    maxNumber = arr[i][j];
                }
            }
        }
        System.out.printf("Max number is %.2f at row %d and column %d",maxNumber,maxRow,maxColumn);
    }
    public static void main(String[] args) {
        double[][] arr = {
                {1,2,3},
                {4,5,6},
                {9.9,8,7}
        };
        System.out.println("Array 1:");
        printArray(arr);
        findMaxNumber(arr);
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Array2:");
        System.out.print("Enter row: ");
        int row = sc.nextInt();
        System.out.print("Enter column: ");
        int column = sc.nextInt();
        double[][] arr2 = new double[row][column];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.printf("Enter value at row %d and column %d: ",i+1,j+1);
                arr2[i][j] = sc.nextDouble();
            }
        }
        printArray(arr2);
        findMaxNumber(arr2);

    }
}
