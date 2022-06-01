// 21 - april - 2022
// program for addition and substraction of the matrix

public class Add_Matix {

    public static void main(String[] args) {

        int arr_1[][] = { { 7, 2, 5 }, { 4, 6, 8 }, { 1, 5, 3 } };
        int arr_2[][] = { { 5, 7, 2 }, { 8, 4, 6 }, { 5, 1, 3 } };

        int[][] result_matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result_matrix[i][j] = arr_1[i][j] + arr_2[i][j];
            }
        }
        System.out.println("Followin shows addition of two matrix :\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result_matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result_matrix[i][j] = arr_1[i][j] - arr_2[i][j];
            }
        }
        System.out.println("Followin shows substraction of two matrix :\n");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result_matrix[i][j] + " ");
            }
            System.out.println();

        }

    }
}
