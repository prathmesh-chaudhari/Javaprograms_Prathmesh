// 10 May 2022
package demo.date_time_currency_codes;

import java.util.Calendar;
import java.util.Date;

public class Calendar_demo {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Date is : " + date);

        Calendar call1 = Calendar.getInstance();
        Calendar call2 = Calendar.getInstance();
        call1.setTime(date);
        call2.setTimeInMillis(999999999999L);

        System.out.println("Our calendar_1 month is : " + call1.get(Calendar.MONTH));

        System.out.println("Our calrnder_1 year is : " + call1.get(Calendar.YEAR));

        System.out.println("Our calendar_1 month is : " + call2.get(Calendar.MONTH));

        System.out.println("Our calrnder_1 year is : " + call2.get(Calendar.YEAR));

        call1.add(Calendar.MONTH, 10);
        date = call1.getTime();
        System.out.println("Our date is " + date);

        call2.roll(Calendar.MONTH, -15);
        date = call2.getTime();
        System.out.println("Our date is " + date);
    }
}
