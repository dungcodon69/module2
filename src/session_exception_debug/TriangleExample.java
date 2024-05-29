package session_exception_debug;

import java.util.Scanner;

public class TriangleExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        try {
            IllegalTriangleCustom.checkTriangle(a,b,c);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("End program");
    }
}
