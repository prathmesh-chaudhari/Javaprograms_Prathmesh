 // 11 May 2022
package demo.number_format;

import java.text.NumberFormat;
import static java.text.NumberFormat.*;

public class NumberFormatDemo {

    public static void main(String[] args) {
        double d = 5231.3691;

        System.out.println("Double is " + d);

        NumberFormat nf = null;

        nf = NumberFormat.getInstance();
        System.out.println("Formatted as a number : " + nf.format(d));

        nf.setMaximumIntegerDigits(2);
        nf.setMaximumFractionDigits(2);

        System.out.println("Formatted number with max 2 digit in/frac " + nf.format(d));

        nf.setMaximumIntegerDigits(3);
        nf.setMaximumFractionDigits(3);

        System.out.println("Formatted number with max 3 digit in/frac " + nf.format(d));

        nf = NumberFormat.getCurrencyInstance();

        System.out.println("Formatted as a currency = " + nf.format(d));
    }
}
