// 21 - april - 2022
// array declaration and implentation

public class OneDimenArrDemo {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[3] = 30;
        arr[4] = 40;

        for (int i = 0; i < 5; i++) {
            System.out.println("The array value at " + i + " is " + arr[i]);
        }

    }
}
