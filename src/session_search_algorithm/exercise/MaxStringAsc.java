package session_search_algorithm.exercise;

import java.util.Scanner;

public class MaxStringAsc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("String: ");
        String str = scanner.nextLine();

        char c = str.charAt(0);
        String newStr = "";
        newStr += c;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) > c){
                newStr += str.charAt(i);
                c = str.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}
