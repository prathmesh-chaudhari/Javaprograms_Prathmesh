// 11 May 2022
package demo.number_format;

import java.text.NumberFormat.*;
import java.util.*;
import java.text.*;

public class CurrencySymbol {

    static void printCurrency(Locale locale) {
        double d = 25454.543;

        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);

        String currency = nf.format(d);

        System.out.println(currency + " for the local " + locale);
    }

    static void printCurrency() {
        double d = 1222.345;

        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        String currency = nf.format(d);
        System.out.println(currency);
    }

    public static void main(String[] args) {
        printCurrency(Locale.ITALY);
        printCurrency(Locale.US);
        printCurrency(Locale.UK);
        printCurrency(Locale.JAPAN);
        printCurrency(Locale.CHINA);
        printCurrency();
    }
}
