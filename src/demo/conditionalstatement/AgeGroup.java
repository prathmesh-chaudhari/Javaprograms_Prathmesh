package demo.conditionalstatement;

//27 - april - 2022

public class AgeGroup {
    float age = 15.10f;

    public void Reveal_AgeGroup() {
        System.out.println("Hello! This program displays the age group.\n");
        if (age >= 0.0 && age <= 125.0) {
            if (age <= 12.99) {
                System.out.println("Age Group : Child");
            } else if (age <= 18.99) {
                System.out.println("Age Group : Adolescence");
            }

            else if (age <= 59.99) {
                System.out.println("Age Group : Adult");
            }

            else {
                System.out.println("Age Group : Senior Adult");
            }
        }
        else {
            System.out.println("Invalid Input!");
        }
        System.out.println();
    }
}
