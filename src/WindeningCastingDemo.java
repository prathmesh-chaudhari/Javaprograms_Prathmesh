// 20 - april - 2022

public class WindeningCastingDemo {
    public static void main(String[] args) {
        int myint = 10;

        double mydouble = myint;    //automatic casting     widening

        System.out.println(myint);  System.out.println(mydouble);

        double mydouble1 = 9.87d;   System.out.println(mydouble1);
        int myint1 = (int) mydouble1;   //manual casting    narrowing 
        System.out.println(myint1);

        byte b = -128; System.out.println(b);    // 2^7 = 128 not accepted   //byte range -128 to 127 total 128 numbers
        int c = b;  System.out.println(c);

        byte d = (byte) c;  System.out.println(d);

        // String[] a = {"o"};
        // System.out.println(a.le);

        // char[] intArr = new char[20];
    }
}
