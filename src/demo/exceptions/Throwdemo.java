// 06 May 2022
// throw keyword demo

package demo.exceptions;


import java.util.Scanner;

public class Throwdemo {

    public static void main(String[] args) {
        System.out.println("Hello from Java!");
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the age in Integer format.");
        int age = in.nextInt();

        if (age < 18) {
            // throw keyword throws error message!!!
            throw new ArithmeticException("He/she is not eligible for voting.");
        } else {
            System.out.println("He/she is eligible for voting.");
        }
    }
}
