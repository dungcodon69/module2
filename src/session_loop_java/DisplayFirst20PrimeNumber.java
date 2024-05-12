package session_loop_java;

public class DisplayFirst20PrimeNumber {
    public static void main(String[] args) {
        int number = 20;
        int count = 0;
        int n = 2;
        while (count < number){
        boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(n+" ");
                count++;
            }
            n++;
        }
    }
}
