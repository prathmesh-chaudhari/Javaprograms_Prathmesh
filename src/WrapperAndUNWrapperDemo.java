// 22 april 2022
// program for concpt of wrapper and un wrapper concpt

public class WrapperAndUNWrapperDemo {
    public static void main(String[] args) {
        // byte data type
        byte b = 1;
        // wrapping around Byte object
        Byte b1 = b;
        System.out.println(b1);

        // int data type
        int i = 10;
        // wrapping around Integer object // or boxing
        Integer i1 = 10;
        System.out.println(i1);
        // float data type
        float f = 12.02f;
        // wrapping around Float object
        Float f1 = f;
        System.out.println(f1);

        float ff = f1;
        System.out.println(ff); // unboxing
    }
}
