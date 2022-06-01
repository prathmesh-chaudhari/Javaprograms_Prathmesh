package demo.stringprogramsdemoo;

public class StringMethodProram {
    void stringmethod() {
        String str = "Are you familiar with Java but want to get the most out of your Java programs?";

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                System.out.println("Char at even index " + i + " is " + str.charAt(i));
            }
        }
        System.out.println();

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0) {
                System.out.println("Char at odd index " + i + " is " + str.charAt(i));
            }
        }
        System.out.println();
        System.out.println("Total length of string variable : " + str.length());
        

     }
}
