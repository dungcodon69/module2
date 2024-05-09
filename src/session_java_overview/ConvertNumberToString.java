package session_java_overview;

import java.util.Scanner;

public class ConvertNumberToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        String stringOfNumber = "";

        if (number < 0 || number > 1000){
            System.out.println("Invalid number");
            return;
        }

        int hundred = number / 100;
        int ten = (number % 100) / 10;
        int one = number % 10;

        if (hundred != 0){
            switch (hundred){
                case 1:
                    stringOfNumber += "one hundred";
                    break;
                case 2:
                    stringOfNumber += "two hundred";
                    break;
                case 3:
                    stringOfNumber += "three hundred";
                    break;
                case 4:
                    stringOfNumber += "four hundred";
                    break;
                case 5:
                    stringOfNumber += "five hundred";
                    break;
                case 6:
                    stringOfNumber += "six hundred";
                    break;
                case 7:
                    stringOfNumber += "seven hundred";
                    break;
                case 8:
                    stringOfNumber += "eight hundred";
                    break;
                case 9:
                    stringOfNumber += "nine hundred";
                    break;
            }
            stringOfNumber += " and ";
        }

        if (ten == 1){
            switch (one){
                case 0:
                    stringOfNumber += "ten";
                    break;
                case 1:
                    stringOfNumber += "eleven";
                    break;
                case 2:
                    stringOfNumber += "twelve";
                    break;
                case 3:
                    stringOfNumber += "thirteen";
                    break;
                case 4:
                    stringOfNumber += "fourteen";
                    break;
                case 5:
                    stringOfNumber += "fifteen";
                    break;
                case 6:
                    stringOfNumber += "sixteen";
                    break;
                case 7:
                    stringOfNumber += "seventeen";
                    break;
                case 8:
                    stringOfNumber += "eighteen";
                    break;
                case 9:
                    stringOfNumber += "nineteen";
                    break;
            }
        } else {
            switch (ten){
                case 2:
                    stringOfNumber += "twenty";
                    break;
                case 3:
                    stringOfNumber += "thirty";
                    break;
                case 4:
                    stringOfNumber += "forty";
                    break;
                case 5:
                    stringOfNumber += "fifty";
                    break;
                case 6:
                    stringOfNumber += "sixty";
                    break;
                case 7:
                    stringOfNumber += "seventy";
                    break;
                case 8:
                    stringOfNumber += "eighty";
                    break;
                case 9:
                    stringOfNumber += "ninety";
                    break;
            }
            if (ten != 0) stringOfNumber += " ";
            switch (one){
                case 1:
                    stringOfNumber += "one";
                    break;
                case 2:
                    stringOfNumber += "two";
                    break;
                case 3:
                    stringOfNumber += "three";
                    break;
                case 4:
                    stringOfNumber += "four";
                    break;
                case 5:
                    stringOfNumber += "five";
                    break;
                case 6:
                    stringOfNumber += "six";
                    break;
                case 7:
                    stringOfNumber += "seven";
                    break;
                case 8:
                    stringOfNumber += "eight";
                    break;
                case 9:
                    stringOfNumber += "nine";
                    break;
            }
        }
        System.out.println(stringOfNumber);

    }
}
