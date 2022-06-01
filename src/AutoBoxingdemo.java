// 22 - april - 2022
// prgram to demonstrate autoboxing concept

import java.util.ArrayList;

public class AutoBoxingdemo {
    public static void main(String[] args) {
        char ch = 'a';
        int num = 10;
        String str = "WOOL loo";

        // Autoboxing primitive to character object conversion

        Character a = ch;
        System.out.println(a);

        Integer i = num;
        System.out.println(i);

        String st = str;
        System.out.println(st);

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(111);
        System.out.println(arrayList.get(0));

    }
}
