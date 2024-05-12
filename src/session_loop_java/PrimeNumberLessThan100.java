package session_loop_java;

public class PrimeNumberLessThan100 {
    public static void main(String[] args) {
        boolean isPrime = true;
        for (int i = 2; i < 100; i++) {
            isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i+" ");
            }
        }
    }
}
