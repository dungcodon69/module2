package session_java_overview;

import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight,height,bmi;
        System.out.println("Enter your weight (kilogram): ");
        weight = scanner.nextDouble();
        System.out.println("Enter your height (meter): ");
        height = scanner.nextDouble();
        bmi = weight / (height*height);
        System.out.printf("%-20s %s %n","BMI","Interpretation");
        if (bmi < 18.5){
            System.out.printf("%-20.2f %s",bmi,"Underweight");
        } else if (bmi < 25.0){
            System.out.printf("%-20.2f %s",bmi,"Normal");
        } else if (bmi < 30.0){
            System.out.printf("%-20.2f %s",bmi,"Overweight");
        } else {
            System.out.printf("%-20.2f %s",bmi,"Obese");
        }
    }
}
