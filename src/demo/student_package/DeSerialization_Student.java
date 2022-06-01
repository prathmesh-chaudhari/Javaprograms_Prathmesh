// 09 May 2022
package demo.student_package;

import demo.serializationcode.EmployeeConstructor;
import java.io.*;
public class DeSerialization_Student {
    public static void main(String[] args) {
        Student_class st = null;
        
        try {
            FileInputStream filein = new FileInputStream("D:\\Student.ser");
            ObjectInputStream in = new ObjectInputStream(filein); 
            st = (Student_class) in.readObject();
            in.close();
            filein.close();
            System.out.println("Serialized data is saved in file");
            
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return ;
        }
        System.out.println("Deserialized Student....");
                System.out.println ("\n"+ "First name: " + st.fname  + " Last name: " + st.lname  + 
                " Rollno: " + st.rollno + "\n" + " Address: " + st.address + 
                " Mobile_no: " + st.mobile_no + " Percentage: " + st.percentage +"\n");
        
    }
    
}
