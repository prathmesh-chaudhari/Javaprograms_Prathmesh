//28 - april - 2022
// row - 4  column - ith    to print - variable c initiale 10 print then decrement
package demo.patternprogramming;

public class ReverseTrianglePattern {
    public static void main(String[] args) {
        int r = 4;
        int c = 10;

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                --c;
            }
            System.out.println();
        }
    }
}
