//22 - april - 2022
//program for passing method as a argument to the array

public class MethodReturnsArray {
    public static void main(String[] args) {
        int arr[] = method1(); // passing method as a argument to the array

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] method1() { // int[] integer array as a return type for method
        return new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 }; // return array of type integer elements in {} :new: for
                                                           // memory allocation

    }
}
