//28 - april - 2022
//row - 4   column - 5  to print - i th row 
package demo.patternprogramming;

public class SquarePattern {
    public static void main(String[] args) {
        int r = 4;
        int c = 5;

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
