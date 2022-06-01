// 22 - april - 2022
// program for cloning the array

public class CloneArrayDemo {
    public static void main(String[] args) {
        int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int clone_ar[] = ar.clone();

        System.out.println(ar == ar); // true

        System.out.println((ar == clone_ar) + "\n"); // this is called DEEP COPY
        // false because diff variables and diff memory allocation inheap memory

        for (int i = 0; i < ar.length; i++) {
            System.out.println(
                    "ar[] " + (ar[i]) + " " + (clone_ar[i]) + " clone_ar[] " + " result - " + (ar[i] == clone_ar[i]));
            // this is called SHALLOW COPY
            // true because value at same index is same though diff variables
        }

        int multidimar[][] = { { 1, 2, 3 } };
        int clone_multidimar[][] = multidimar.clone();
        System.out.println("\nMulti Dimension deep copy -   " + (multidimar == clone_multidimar));
        System.out.println("Multi Dimension shallow copy -   " + (multidimar[0] == clone_multidimar[0]));

    }
}
