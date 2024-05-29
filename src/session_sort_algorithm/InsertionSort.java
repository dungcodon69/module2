package session_sort_algorithm;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        insertionSort(list);
        System.out.println(Arrays.toString(list));
    }

    private static void insertionSort(double[] list) {
        double x;
        int pos;
        for (int i = 1; i < list.length; i++) {
            x = list[i];
            pos = i;
            while (pos > 0 && x < list[pos-1]){
                System.out.println("Put element ["+(pos-1)+"]="+list[pos-1]+" to element ["+pos+"]="+list[pos]);
                list[pos] = list[pos-1];
                pos--;
            }
            list[pos] = x;
            System.out.println(Arrays.toString(list));
        }
    }
}
