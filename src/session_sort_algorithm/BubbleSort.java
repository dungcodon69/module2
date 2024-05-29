package session_sort_algorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        bubbleSort(list);
        System.out.println(Arrays.toString(list));
    }

    private static void bubbleSort(int[] list) {
        boolean nextPass = true;
        for (int i = 0; i < list.length - 1 && nextPass; i++ ){
            nextPass = false;
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] > list[j+1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    nextPass = true;
                }
            }
        }

    }

}
