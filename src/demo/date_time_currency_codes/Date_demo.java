// 10 May 2022
package demo.date_time_currency_codes;

import java.util.Date;

public class Date_demo {

    public static void main(String[] args) {
        Date date1 = new Date();//to get system date
        Date date2 = new Date(999999999999L);
        Date date3 = new Date(999999999999999L);

        System.out.println("Ourfirst date is - " + date1);
        System.out.println("Our second date ois _ " + date2);
        System.out.println("Our third dateis - " + date3);

        if (date1.after(date2)) {
            System.out.println("our first date is after date two");

        }
        if (date2.after(date3)) {
            System.out.println("our second date is before third date.");
        }
        date2.setTime(date2.getTime() + 9999999999999L);
        System.out.println("our updated second date is - " + date2);
        
        if(date2.before(date3)){
            System.out.println("our second date is before date 3");
        }else{
            System.out.println("our second date is after our third date");
        }
    }

}
