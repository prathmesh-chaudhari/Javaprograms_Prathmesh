package demo.user_input_injava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Employee {
    int id;
    int age;
    String name;
    double salary;
    String post;
    String address;

    Employee(int id, String name, int age, double salary, String post, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.post = post;
        this.address = address;
    }

    void showemployeedetail() {
        System.out.println();
        System.out.println("Employee id " + id);
        System.out.println("Employee name " + name );
        System.out.println("Employee age " + age );
        System.out.println("Employee salary " + salary ); 
        System.out.println("Employee post " + post );
        System.out.println("Employee address " + address );
    }
}

public class DemoBufferReader {
    public void bufferInput() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the id ");
        int id = (int) (Integer.parseInt(br.readLine()));

        System.out.println("Enter the name ");
        String name = br.readLine();

        System.out.println("Enter the age ");
        int age = (int) (Integer.parseInt(br.readLine()));

        System.out.println("Enter the salary ");
        double salary = (double) (Double.parseDouble(br.readLine()));

        System.out.println("Enter the post ");
        String post = br.readLine();

        System.out.println("Enter the address ");
        String address = br.readLine();

        Employee emp = new Employee(id, name, age, salary, post, address);
        emp.showemployeedetail();

    }
}
