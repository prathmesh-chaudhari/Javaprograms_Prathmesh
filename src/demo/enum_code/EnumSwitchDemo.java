// 14 May 2022
package demo.enum_code;

enum Day {
    Monday, Tuesday, Wenesday, Thursday, Friday, Saturday, Sunday;
}

public class EnumSwitchDemo {

    Day day;

    public EnumSwitchDemo(Day d) {
        this.day = d;
    }

    public void dayLike() {
        switch (day) {
            case Monday:
                System.out.println("Monday is the first day of the week.");
                break;

            case Tuesday:
                System.out.println("Tuesday is the second day of the week.");
                break;

            case Wenesday:
                System.out.println("Wenesday is the third day of the week.");
                break;

            case Thursday:
                System.out.println("Thursday is the fourth day of the week.");
                break;

            case Friday:
                System.out.println("Friday is the fifth day of the week.");
                break;

            case Saturday:
                System.out.println("Saturday is the sixth day of the week.");
                break;

            case Sunday:
                System.out.println("Sunday is the seventh day of the week.");
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public static void main(String[] args) {
        String s = "Friday";
        EnumSwitchDemo esd = new EnumSwitchDemo(Day.valueOf(s));
        esd.dayLike();
    }
}
