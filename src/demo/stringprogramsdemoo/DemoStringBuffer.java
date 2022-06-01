package demo.stringprogramsdemoo;

public class DemoStringBuffer {
    void demostrbuffer() {
        StringBuffer str = new StringBuffer("This is a sample string");
        System.out.println(str);

        System.out.println(str.append('.'));

        System.out.println(str.replace(16, 23, "buffer program"));

        System.out.println(str.insert(16, " stringUNWANTED"));

        System.out.println(str.delete(23, 31));

        StringBuffer palindrome = new StringBuffer("yaay! racecar");

        System.out.println(palindrome.reverse());

        StringBuffer defaultti = new StringBuffer();
        System.out.println("default capacity - " + defaultti.capacity());

        defaultti.ensureCapacity(150);

        System.out.println("Now check the capacity - " + defaultti.capacity());



    }
}
