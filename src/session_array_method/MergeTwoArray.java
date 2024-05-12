package session_array_method;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        for (int i = 0; i < 5; i++) {
            arr1[i] = i+5;
            arr2[i] = i+6;
        }
        for (int n :
                arr1) {
            System.out.print(n+" ");
        }
        System.out.println();
        for (int n :
                arr2) {
            System.out.print(n+" ");
        }
        System.out.println();
        System.out.println("Merge two array: ");
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr2.length + i ] = arr2[i];
        }

        for (int n :
                arr3) {
            System.out.print(n +" ");
        }
    }
}
