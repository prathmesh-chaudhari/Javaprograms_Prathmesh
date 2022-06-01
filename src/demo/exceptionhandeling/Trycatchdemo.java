/*      05 May 2022
Program to show try{}   catch(){} code


*/


package demo.exceptionhandeling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Trycatchdemo {
    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the value of var1 ");
            int var1 = in.nextInt();

            System.out.println("Enter the value of var2 ");
            int var2 = in.nextInt();
            in.close();

            //NESTED TRY BLOCK
            try {
                var2 = var2 / var1;
                System.out.println("Division value is  " + var2);
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception occured - don't use zero for division");
            }

        } catch (InputMismatchException e) {

            System.out.println("Please enter interger value");

        }

        System.out.println("Yes!");
        System.out.println("PROGRAM EXECUTED!");

    }

}
