package demo.conditionalstatement;

//27 - april - 2022
public class NestedIf {
    public static void main(String[] args) {
        int num = 107;

        if (num > 100) {
            System.out.println("Number is greater than 100.");
            if (num < 120) {
                System.out.println("Number is less than 120.");
                if (num % 2 == 0) {

                    System.out.println("Number is divisible by 2.");
                } else {
                    System.out.println("Number is not divisible by 2.");
                }
            } else {
                System.out.println("Number is greater than 120.");
            }
        } else {
            System.out.println("Number is greater than 100.");
        }
    }
}
