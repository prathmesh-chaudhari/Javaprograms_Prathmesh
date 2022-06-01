// 11 May 2022
package demo.locale_class_demo;

import java.util.Locale;

public class LocaleDemo {

    public static void main(String[] args) {
        Locale[] allLocale = Locale.getAvailableLocales();
        int i = 0;

        for (Locale local : allLocale) {
            i++;

            System.out.println(i + " Country : " + local.getDisplayCountry());
            System.out.println("Language : " + local.getDisplayLanguage());

//            if (i > 10) {
//                break;
//            }
        }

    }
}
