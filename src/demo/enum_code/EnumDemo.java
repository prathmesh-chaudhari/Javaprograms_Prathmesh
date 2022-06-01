// 14 May 2022
package demo.enum_code;

public class EnumDemo {

    public enum Weekday {
        Monday(5), Tuesday(10), Wenesday(15), Thursday(20);
        private int v;

        private Weekday(int v) {
            this.v = v;
        }
    }

    public static void main(String[] args) {
        for (Weekday w : Weekday.values()) {
            System.out.println(w + " " + w.v);

        }
    }
}
