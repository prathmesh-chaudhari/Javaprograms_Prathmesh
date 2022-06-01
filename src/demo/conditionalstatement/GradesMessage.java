package demo.conditionalstatement;

//27 - april - 2022
public class GradesMessage {

    float marks = 59.99f;

    public void Show_Grades() {

        System.out.println("Hii . This program displays the grade.\n");
        if (marks >= 0.0 && marks <= 100.0) {
            if (marks >= 75.0) {
                System.out.println("Grade :  Distinction!!!!!");
            }

            else if (marks >= 60.0) {
                System.out.println("Grade :  First Class!!!");
            }

            else if (marks >= 40.0) {
                System.out.println("Grade :  Pass!!");
            }

            else {
                System.out.println("Grade :  Fail!");
            }

        }

        else {
            System.out.println("Invalid Grade..");
        }
        System.out.println();
    }
}
