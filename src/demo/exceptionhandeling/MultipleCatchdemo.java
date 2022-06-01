package demo.exceptionhandeling;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchdemo {
    public static void main(String[] args) {
        int myArray[] = new int[5];
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;

        Scanner in = new Scanner(System.in);

        try {

            System.out.println("index i ");
            int i = in.nextInt();
            System.out.println("divides by ");
            int j = in.nextInt();
            System.out.println("index k ");
            int k = in.nextInt();
            in.close();
            try {
                myArray[i] = 10 / j;
                System.out.println("index - " + myArray[i]);
                System.out.println("divide by " + myArray[j]);
                System.out.println("index - " + myArray[k]);
            } catch (ArithmeticException e) {
                System.out.println("Exception : " + e.getMessage());
            } // default exception
            catch (Exception e) {
                System.out.println("Exception : " + e.getMessage());
            }
        } catch (InputMismatchException e) {
            System.out.println("Exception : " + e.getMessage());
        }
        // print value in arrays
        System.out.println(Arrays.toString(myArray));

    }
}
