package demo.stringprogramsdemoo;

public class StringStorage {
    void demostrstorage() {
        StringBuffer sbr = new StringBuffer("str");
        System.out.println("sbr : " + sbr);

        StringBuffer sbc = sbr;
        System.out.println("sbc : " + sbc);

        StringBuffer sb = new StringBuffer("str");
        System.out.println("sb : " + sb);

        StringBuffer s = new StringBuffer("str");
        System.out.println("s : " + s);
    }
}
