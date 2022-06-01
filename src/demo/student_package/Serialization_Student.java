
package demo.student_package;

import java.io.*;
public class Serialization_Student {
    public static void main(String[] args) {
        Student_class st = new Student_class();
        st.fname = "Warang";
        st.lname = "Umthe";
        st.rollno = 97;
        st.address = "Catedral candice, GorgesLand";
        st.mobile_no = 90877567;
        st.percentage = 89.976;
        
        try {
            FileOutputStream fileout = new FileOutputStream("D:\\Student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(st);
            out.close();
            fileout.close();
            System.out.println("Serializwd data is saved in D:\\employee.ser");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
