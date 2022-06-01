// 14 May 2022
package demo.enum_code;

enum Season{ Winter, Spring, Summer, Fall;}

public class EnumExample {
    public static void main(String[] args) {
        for (Season s : Season.values()) {
            System.out.println(s);
            
        }
        
        System.out.println("value of Winter is : " + Season.valueOf("Winter"));
        
        System.out.println("Index of Winter is : " + Season.valueOf("Winter").ordinal());
        
        System.out.println("value of Summer is : " + Season.valueOf("Summer"));
        
        System.out.println("Index of Summer is : " + Season.valueOf("Summer").ordinal());
    }
}
