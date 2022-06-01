package demo.conditionalstatement;

//27 - april - 2022
public class Switch_WeekDay {
    int choice = 1;

    public void Tell_DayOfWeek() {
        System.out.println("\nThis program tells the day of the week.\n");

        switch (choice) {
            case 1:
                System.out.println("Sunday!");
                break;
            case 2:
                System.out.println("Monday!");
                break;
            case 3:
                System.out.println("Tuesday!");
                break;
            case 4:
                System.out.println("Wenesday!");
                break;
            case 5:
                System.out.println("Thrusday!");
                break;
            case 6:
                System.out.println("Friday!");
                break;
            case 7:
                System.out.println("Saturday!");
            default:
                System.out.println("Invalid choice..");
                
        }
    }
}
