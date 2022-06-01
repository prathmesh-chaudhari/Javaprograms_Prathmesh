package demo.conditionalstatement;

//27 - april - 2022
public class Continuedemo {
    void ShowContinuedemo() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        } 
    }
}
