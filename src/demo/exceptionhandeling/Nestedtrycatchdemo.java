package demo.exceptionhandeling;

public class Nestedtrycatchdemo {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            // 5 - er
            arr[5] = 10;
            System.out.println("Inside outer try block");
            // try block1
            try {
                System.out.println("Try block 1");
                // / 0 - er
                int num = 15 / 0;
                System.out.println(num);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception : " + e.getMessage());
            }

            // try block2
            try {
                System.out.println("Try block 2");
                // / 0 - er
                int num = 100 / 0;
                System.out.println(num);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("After block 1 and block 2");

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
