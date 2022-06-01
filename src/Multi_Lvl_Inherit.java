// 13 - april - 22
// program for multi level inherit
import java.io.*;
import java.util.*;


class One {
    
    void printone (){
        System.out.println("class one is called");
    }
}

class Two extends One{
    
    void printtwo (){
        System.out.println("class two is called");
    }
}

class Three extends Two{
    
    void printthree (){
        System.out.println("class three is called");
    }
}

class Four extends Three{
    
    void printfour (){
        System.out.println("class four is called");
    }
}

public class Multi_Lvl_Inherit {
    public static void main(String args[]) {
        Four f = new Four();
        f.printfour();
        f.printthree();
        f.printone();
        f.printtwo();
    }
}
