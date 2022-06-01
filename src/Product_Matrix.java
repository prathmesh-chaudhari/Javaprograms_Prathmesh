// 21 - april - 2022
// program for multiplication of the matrix

public class Product_Matrix {
    public static void main(String[] args) {

        int arr_1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int arr_2[][] = { { 1, 2, 1 }, { 2, 4, 6 }, { 7, 2, 5 } };

        int[][] result_matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {// for row

            for (int j = 0; j < 3; j++) {// for column

                result_matrix[i][j] = 0;

                for (int k = 0; k < 3; k++) {
                    result_matrix[i][j] += arr_1[i][k] * arr_2[k][j]; // general solution for 3*3 matrix
                }
                System.out.print(result_matrix[i][j] + " ");// print the value

            }
            System.out.println();// next row
        }
    }
}
