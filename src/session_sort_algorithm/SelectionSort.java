package session_sort_algorithm;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        System.out.println(Arrays.toString(list));
        selectionSort(list);
        System.out.println("Selection sorted");
        System.out.println(Arrays.toString(list));

    }

    private static void selectionSort(double[] list) {
        for (int i = 0; i < list.length-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < list.length; j++) {
                if (list[min_idx] > list[j]){
                    min_idx = j;
                }
            }
            if (min_idx != i){
                System.out.println("Swap element ["+i+"]="+list[i]+" with element ["+min_idx+"]="+list[min_idx]);
            }
            double temp = list[i];
            list[i] = list[min_idx];
            list[min_idx] = temp;

        }
    }

}
