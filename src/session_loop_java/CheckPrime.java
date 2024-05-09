package session_loop_java;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println("Enter a number to check prime number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 2 ){
            System.out.println("It's not a prime number");
        }
        else {
            int i = 2;
            boolean isPrime = true;
            while(i < Math.sqrt(number)){
                if (number % i == 0){
                    isPrime = false;
                }
                i++;
            }
            if (isPrime){
                System.out.println("It's a prime number");
            } else {
                System.out.println("It's not a prime number");
            }
        }
    }
}
