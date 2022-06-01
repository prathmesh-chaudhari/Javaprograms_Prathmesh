package demo.miscellaneous;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();

        for (int i = 0; i <= num; i++) {
            if (num == 0) {
                System.out.println(num);
                break;
            } else if (num == 1 || num == 2) {
                System.out.println("1");
                break;
            } else if ((i * i) == num) {
                System.out.println(i);
                break;
            } else if ((i * i) > num) {
                System.out.println(i - 1);
                break;
            }

        }

    }
}
