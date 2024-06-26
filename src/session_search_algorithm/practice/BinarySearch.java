package session_search_algorithm.practice;

public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int result = binarySearch(list,11);
        System.out.println(result);
    }

    private static int binarySearch(int[] list, int i) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low){
            int mid = (high + low) / 2;
            if (list[mid] == i) return mid;
            else if(list[mid] > i){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }



}
