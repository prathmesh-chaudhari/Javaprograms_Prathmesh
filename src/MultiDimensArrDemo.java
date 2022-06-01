public class MultiDimensArrDemo {
    public static void main(String[] args) {
        int arr[][] = { { 7, 2, 5 }, { 4, 6, 8 }, { 1, 5, 3 } };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
