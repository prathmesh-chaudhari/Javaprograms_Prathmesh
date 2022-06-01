// 13 - april -22
// program for compiletime type polymorphism

class Helper {

    static int Multiply (int a, int b) {
        return a*b;
    }  

    static double Multiply (double a, double b) {
        return a*b;
    }

}

public class Compile_time_polymorphism {
    public static void main (String args []) {
        Helper h = new Helper();
        int Int_multi = h.Multiply(2, 5);
        double Double_multi = h.Multiply(2.0, 5.0); // object way of calling
        System.out.println(Int_multi);
        System.out.println(Double_multi);

        System.out.println(Helper.Multiply(3, 4));      // Another way of calling
        System.out.println(Helper.Multiply(3.0, 4.0));
    }
}
