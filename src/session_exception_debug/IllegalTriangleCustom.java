package session_exception_debug;

public class IllegalTriangleCustom {
    static void checkTriangle(int a, int b, int c) throws IllegalTriangleException{
        if (a + b <= c || b + c <= a || c + a <= b){
            throw new IllegalTriangleException("Sum of two side have to greater than remaining side");
        }
        if (a <= 0 || b <= 0 || c <= 0){
            throw new IllegalTriangleException("Side can not be negative number");
        }
    }
}
