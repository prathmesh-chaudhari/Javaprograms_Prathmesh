//27 - april - 2022
package demo.conditionalstatement;

public class If_Statements {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if (a >= 30) {
            System.out.println("a is greater than 30");
        } else {
            System.out.println("a is less than 30");
        }

        if (b <= 60) {
            System.out.println("b is less than 60");
        } else {
            System.out.println("b is greater than 60");
        }

        if (a == b) {
            System.out.println("a is same as b");
        } else {
            System.out.println("a is not same as b");
        }

        if (a != b) {
            System.out.println("a is not same as b");
        }
    }
}
