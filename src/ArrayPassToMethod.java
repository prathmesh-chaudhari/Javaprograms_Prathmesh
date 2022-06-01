//22 - april - 2022
//program for passing array to the method
//program for passing two arrays to the method

public class ArrayPassToMethod {
    public static void main(String[] args) {
        int[] arr_1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] arr_2 = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        sum(arr_1, arr_2); // method call and declared
        diff(arr_1, arr_2); // method call and declared
    }

    public static void sum(int arr_1[], int[] arr_2) { // array as a parameter
        int sum = 0;
        for (int i = 0; i < arr_1.length; i++) {
            sum += arr_1[i] + arr_2[i];
        }

        System.out.println("Sum = " + sum);
    }

    public static void diff(int arr_1[], int[] arr_2) { // array as a parameter
        int diff = 0;
        for (int i = 0; i < arr_1.length; i++) {
            diff += arr_1[i] - arr_2[i];
        }
        

        System.out.println("Difference = " + diff);
    }
}
