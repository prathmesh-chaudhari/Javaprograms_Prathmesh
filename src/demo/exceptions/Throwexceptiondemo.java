 // 06 May 2022

package demo.exceptions;

public class Throwexceptiondemo {

    void arithmetic() {
        try {
            int a = 10 / 0;
            throw new ArithmeticException("Arithmetic Exception handle.");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception caught inside arithmetic()..");
            throw e;
        }
    }

    static void fun() {
        try {
            System.out.println("Hello from Java!");
            //Nothing in the code 
            //throw new NullPointerException("Null Pointer Exception");

        } catch (NullPointerException e) {
            System.out.println("Caught inside fun()..");
            throw e;    //throws to main
        }
    }

    public static void main(String[] args) {
        try {
            fun();//call to fun method  
            //recieves obj e
            Throwexceptiondemo ted = new Throwexceptiondemo();
            ted.arithmetic();
        } catch (NullPointerException e) {
            System.out.println("Caught inside main()....");
        }
        catch(ArithmeticException e){
            System.out.println("This is also caught in main()..");
        }
    }
}
