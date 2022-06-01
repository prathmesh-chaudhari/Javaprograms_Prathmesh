package demo.conditionalstatement;

//27 - april - 2022
public class EnhancedForLoop {
    
    void ShowEnhancedForLoop() {
        String arr[] = { "Amar", "Anant", "Amay", "Akash", "Anand" };
        System.out.println("Enhanced for loop!!!!");
        for (String x : arr) {
            System.out.println(x);
        }

        System.out.println("Simple for loop!");
        for (int i = 1; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
