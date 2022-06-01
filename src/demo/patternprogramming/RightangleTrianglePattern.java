//  28 - april - 2022
// row - 5  column -  i column for each row     to print jth column

package demo.patternprogramming;

public class RightangleTrianglePattern {
    public static void main(String[] args) {
        int r = 5;
        

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
