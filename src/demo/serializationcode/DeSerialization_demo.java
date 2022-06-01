// 09 May 2022
package demo.serializationcode;

import  java.io.*;
public class DeSerialization_demo {
    public static void main(String[] args) {
            EmployeeConstructor sc = null;
    
        try {
            FileInputStream filein = new FileInputStream("D:\\employee.ser");
            ObjectInputStream in = new ObjectInputStream(filein); 
            sc = (EmployeeConstructor) in.readObject();
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
        System.out.println("Deserialized employee....");
        System.out.println("Name    " + "Age    " + "ID    " + "    Div");
        System.out.println("\n" + sc.name  + "    " + sc.age  + "     " + sc.id + "   " + sc.div +"\n");
    }
    
}
