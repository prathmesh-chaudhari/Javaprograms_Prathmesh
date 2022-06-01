// 09 May 2022

package demo.serializationcode;

import java.io.*;

public class Serialization_demo {
    public static void main(String[] args) {
        EmployeeConstructor sc = new EmployeeConstructor();
        sc.name = "Anay";
        sc.age = "56";
        sc.id = "XIcgh097";
        sc.div = "Customs";
        
        try {
            FileOutputStream fileout = new FileOutputStream("D:\\employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(sc);
            out.close();
            fileout.close();
            System.out.println("Serializwd data is saved in D:\\employee.ser");
            
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
}
