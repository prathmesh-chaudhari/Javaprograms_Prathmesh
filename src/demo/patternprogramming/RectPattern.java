//28 - apil-2022
//row - 4   column - 5      to print - k variable from 1 then increment after printed

package demo.patternprogramming;

public class RectPattern {
    public static void main(String[] args) {
        int r = 4;
        int c = 5;
        int k = 1;

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print(k + "  ");
                ++k;
            }
            System.out.println();
        }
    }
}
