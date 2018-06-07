package remainderlab.recursion;

import java.util.*;

public class RemainderLabRecursion {

    public static void main(String[] args) {


        /*  Programmer: Solomon Davis
        Due Date: Wednesday, April 30, 2018
        Project Description: This program, using recursion, will allow a user
        to enter a base 10 value and the base value the base 10 value will be
        converted to. The new base value will be displayed to the user. 
        Project Number: Lab 07
         */
        GetNumbers();

    }

    public static void GetNumbers() {

        int num, base;
        char userChoice;

        Scanner kbd = new Scanner(System.in);

        System.out.println("What is the number you would like to convert?");
        num = kbd.nextInt();

        System.out.println("What is the base?");
        base = kbd.nextInt();

        RetrieveValues(num, base);

        System.out.println("\n\nDo you want to do another?\nY - yes\nN - No ");
        kbd.nextLine();
        userChoice = kbd.nextLine().charAt(0);

        if (userChoice == 'y' || userChoice == 'Y') {
            GetNumbers();

        }

    }

    public static void RetrieveValues(int num, int base) {

        int remainder, quotient;
        String value;

        remainder = num % base;
        quotient = num / base;

        num = quotient;

        switch (remainder) {
            case 10:
                value = "A";
                break;
                
            case 11:
                value = "B";
                break;
                
            case 12:
                value = "C";
                break;
                
            case 13:
                value = "D";
                break;
                
            case 14:
                value = "E";
                break;
                
            case 15:
                value = "F";
                break;
                
            default:
                value = "" + remainder;

        }

        if (num != 0) {
            RetrieveValues(num, base);
        }

        System.out.print(value);

    }

}
