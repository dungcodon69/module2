package session_class_object.stopwatch;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        StopWatch stopWatch = new StopWatch();
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = random.nextInt(1000000);
        }
        stopWatch.start();
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
        stopWatch.stop();
        System.out.println(Arrays.toString(arr));
        System.out.println(stopWatch.getElapsedTime());
    }
}
