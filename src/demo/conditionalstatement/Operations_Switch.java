package demo.conditionalstatement;

//27 - april - 2022
public class Operations_Switch {
    int choice;
    int a, b, c, d;

    Operations_Switch(int choice, int a, int b, int d) {

        this.choice = choice;
        this.a = a;
        this.b = b;
        this.d = d;

    }

    public void doOperation() {
        System.out.println("\nThis program performs different operation base on the choice.\n");
        

        switch (choice) {
            case 1:
                System.out.println("Choice 1 - Addition\n");
                c = a + b;
                System.out.println("Sum = " + c);
                break;
            case 2:
                System.out.println("Choice 2 - Substraction\n");
                c = a - b;
                System.out.println("Difference = " + c);
                break;

            case 3:
                System.out.println("Choice 3 - Multiplication\n");
                c = a * b;
                System.out.println("Product = " + c);
                break;

            case 4:
                System.out.println("Choice 4 - Division\n");
                c = a / b;
                System.out.println("Quotient = " + c);
                break;

            case 5:
                System.out.println("Choice 5 - Iseven\n");
                System.out.println("Is even = " + (a % 2 == 0));
                break;
                
            case 6:
                System.out.println("Choice 6 - Isodd\n");
                System.out.println("Is odd = " + (b % 2 != 0));
                break;

            case 7:
                System.out.println("Choice 7 - Leap year or not\n");
                System.out.println("Is Leap Year = " + (d % 4 == 0));
                break;
                
            default:
                System.out.println("Invalid Choice!\nAccepted choice 1 - 7.");
        }
    }

}
