//28 - april - 2022
//row - 4   column - i column for each row      to print "*"
package demo.patternprogramming;

public class TriangleStarPattern {
    public static void main(String[] args) {
        int r = 4;
        

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
