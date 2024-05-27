package session_search_algorithm.exercise;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int result = binarySearch(list,0,list.length-1,1);
        System.out.println(result);
    }

    private static int binarySearch(int[] list, int low, int high, int value) {
        if (high < low){
            return -1;
        }
        int mid = (low + high) / 2;
        if (list[mid] == value) return mid;
        else if (list[mid] < value) return binarySearch(list,mid + 1, high,value);
        else return binarySearch(list,low,mid - 1,value);
    }
}
