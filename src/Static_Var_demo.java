// 16 - april - 2022
// program for concept of static variable
// change value of static var by static method

class Vidhyarathi {
    int rollno;     // declaration of data
    String name;
    static String collegename = "DIEMS, Aurangabad";

    Vidhyarathi( int rollno, String name) {  // constructor
        this.rollno = rollno;
        this.name = name;        
    }

    static void changenamecollege()  {  // change value of static variable by static method
        collegename = "GPA, Aurangabad";
    }

    void display () {       // display method to display the data
        System.out.println(rollno + "   " + name + "    " + collegename);
    }
}


public class Static_Var_demo {
    public static void main(String[] args) {
        
        Vidhyarathi.changenamecollege();    // call static method which changes static variable value
        // commenting above line will reset the static var value to the DIEMS, Aurangabad

        Vidhyarathi v1 = new Vidhyarathi(01, "Chitayan Mule");      // object created
        Vidhyarathi v2 = new Vidhyarathi(02, "Peasidh Chitale"); 
        Vidhyarathi v3 = new Vidhyarathi(03, "Chinmay Wagh");        
        Vidhyarathi v4 = new Vidhyarathi(04, "Nayan Tilak");        
        Vidhyarathi v5 = new Vidhyarathi(05, "Chitayan Gage"); 
        
        v1.display();       // object call
        v2.display();
        v3.display();
        v4.display();
        v5.display();
        
    }
}
