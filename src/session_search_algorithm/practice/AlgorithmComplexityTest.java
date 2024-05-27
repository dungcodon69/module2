package session_search_algorithm.practice;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        int[] arr = new int[255];
        String str = "Hello";
        for (int i = 0; i < str.length();i++){
            int c = str.charAt(i);
            arr[c] += 1;
        }
        int max = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        char c = (char) index;
        System.out.println(c);
    }
}
