// 16 - april - 2022

class Created {
    static int sum, sub, multi, divi;
    static int a = 10;
    static int b = 3; 
    static int c = 8; 

    static   {
        System.out.println("\nThis program performs mathematical operations on the static variable\n");
        System.out.println("\nOperation performed with initial values\n");
    }

    static void Sum() {
        sum = a + b + c;
        System.out.println("    Sum of static variables  : " + sum);

        sub = a - b - c;    
        System.out.println("    Substraction of static variables  : " + sub);

        multi = a * b * c;
        System.out.println("    Product of static variables  : " + multi);

        divi = a/b ;
        System.out.println("    Division of static variables  : " + divi);
    }

    static void changevalue () {        //changes values of static variables
        a = 80;
        b = 2;
        c = 40;
        System.out.println("\nOperation performed after changing values\n");

    }

}

public class Static_program {
    public static void main(String[] args) {
        // Created cr = new Created();
        // cr.Dips();
        // cr.Sum();

        // cr.changevalue();
        // cr.Sum();
        
        // System.out.println("Main Method executed");

        //Created.Dips();
        Created.Sum();     //ClassName.methodName  call    without object created
        Created.changevalue();
        Created.Sum();

    }
}
