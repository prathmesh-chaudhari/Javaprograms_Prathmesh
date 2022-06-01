// 29 - april - 2022
// programs demonstrate the use of labels in java

package demo.conditionalstatement;

public class LabelsinJava {

    void DemonstrateLabels() {

        first: // label
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1) {
                    continue first;// use of label continue forcefully completes
                                   // iteration for i = 1
                }
                System.out.println("[ i = " + i + ", j = " + j + " ]");
            }
        }
        System.out.println();

        second: // label
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1) {
                    break second;// use of label break terminates the current block
                }
                System.out.println("[ i = " + i + ", j = " + j + " ]");
            }
        }
    }
}