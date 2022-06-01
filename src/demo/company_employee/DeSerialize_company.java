// 09 May 2022
package demo.company_employee;

import java.io.*;

public class DeSerialize_company {

    public static void main(String[] args) {

       Project prr = null;

        try {
            FileInputStream filein = new FileInputStream("D:\\companys_employee.ser");
            ObjectInputStream in = new ObjectInputStream(filein);
            prr = (Project) in.readObject();
            in.close();
            filein.close();
            System.out.println("Serialized data is saved in file");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialized company's employee....");

        System.out.println("\nDetails of person");
        System.out.println("first name - " + prr.fname + " last name - " + prr.lname + " age - "
                + prr.age + " address - " + prr.address);

        System.out.println("\nDetails of Employee");
        System.out.println("id - " + prr.id + " salary - " + prr.salary
                + " company name - " + prr.company_name);

        System.out.println("\nDeatils of Department");
        System.out.println("department name - " + prr.deptname + " no. of employee - "
                + prr.no_of_employee);

        System.out.println("\nDetails of Project");
        System.out.println("project name - " + prr.project_name + " project duration - "
                + prr.duration);

    }

}
