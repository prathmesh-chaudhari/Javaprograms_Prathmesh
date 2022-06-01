// 28 - arpil - 2022
//  row - 5  column -  i column for each row     to print ith row

package demo.patternprogramming;

public class TriiPattern {
    public static void main(String[] args) {
        int r = 5;
        

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
