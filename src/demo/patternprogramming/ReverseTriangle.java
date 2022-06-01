//28 -april - 2022
//row - 5   column - c value which deceases after each row      to print - jth column

package demo.patternprogramming;

public class ReverseTriangle {
    public static void main(String[] args) {
        int r = 5;
        int c = 5;

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print(j+ " ");
                
            }
            System.out.println();
            --c;
        }
    }
}
