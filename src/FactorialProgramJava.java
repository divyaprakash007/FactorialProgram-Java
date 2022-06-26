import com.sun.tools.javac.Main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FactorialProgramJava {
    public static void main(String[] args) {
       System.out.println("Factorial of the entered number is : " + fact(getUserInput()));
    }

    private static int getUserInput() {
       int num = 0;
       System.out.print("Enter the number : ");
       try {
           num = new Scanner(System.in).nextInt();
           if (num<1) {
               System.out.println("Please enter a positive number.");
               getUserInput();
           }
       } catch (InputMismatchException e) {
           System.out.println("Please enter a valid number;");
           getUserInput();
       }
       return num;
    }

    /*Get the user's number as argument and process it to get factorial.
    * Recursion: Function calling itself!!
    * Method is defined private, So it cannot be used outside the main class.
    * Method can be accessed without any object of class, static in nature. */
    private static int fact(int num) {
        if (num == 1) return 1;
        return fact(num - 1)*num;
    }
}