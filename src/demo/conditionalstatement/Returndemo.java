package demo.conditionalstatement;

//27 - april - 2022
public class Returndemo {

    void returndemo() {
        boolean t = true;
        System.out.println("Before the return..");
        if (t) {
            return;
        }
        System.out.println("This won't be executed!!");
    }

}
