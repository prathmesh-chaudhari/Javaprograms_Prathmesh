// 09 May 2022
package demo.company_employee;

import java.io.*;
import java.util.Scanner;

public class Serialize_company {

    public static void main(String[] args) {

        Project prr = new Project();
        Scanner ap = new Scanner(System.in);
        System.out.println("Enter the first name : ");
        prr.fname = ap.next();
        System.out.println("Enter the last name : ");
        prr.lname = ap.next();
        System.out.println("Enter the age : ");
        prr.age = ap.nextInt();
        System.out.println("Enter the address : ");
        prr.address = ap.next();

        Scanner ae = new Scanner(System.in);
        System.out.println("Enter the id : ");
        prr.id = ae.nextInt();
        System.out.println("Enter the salary : ");
        prr.salary = ae.nextDouble();
        System.out.println("Enter the company: ");
        prr.company_name = ae.next();

        Scanner ad = new Scanner(System.in);
        System.out.println("Enter the department name : ");
        prr.deptname = ad.next();
        System.out.println("Enter the no. of employee : ");
        prr.no_of_employee = ad.nextInt();

        Scanner apr = new Scanner(System.in);
        System.out.println("Enter the project name : ");
        prr.project_name = apr.next();
        System.out.println("Enter the project duration : ");
        prr.duration = apr.next();



      
        try {
            FileOutputStream fileout = new FileOutputStream("D:\\companys_employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(prr);
            out.close();
            fileout.close();
            System.out.println("Serializwd data is saved in D:\\companys_employee.ser");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
