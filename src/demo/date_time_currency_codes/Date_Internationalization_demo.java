// 10 May 2022
package demo.date_time_currency_codes;

import java.text.DateFormat;
import java.util.Date;

public class Date_Internationalization_demo {

    public static void main(String[] args) {
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT);
        System.out.println(dateFormat.format(new Date()));

        dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(dateFormat.format(new Date()));

        dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(dateFormat.format(new Date()));

        dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(dateFormat.format(new Date()));

        dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(dateFormat.format(new Date()));

//        dateFormat = DateFormat.getDateInstance(mat.MEDIUM);
//        System.out.println(dateFormat.format(new Date()));
    }
}
