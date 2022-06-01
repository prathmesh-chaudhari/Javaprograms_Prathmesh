package demo.user_input_injava;

import java.util.Scanner;

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
        System.out.println("Employee name " + name);
        System.out.println("Employee age " + age);
        System.out.println("Employee salary " + salary);
        System.out.println("Employee post " + post);
        System.out.println("Employee address " + address);
    }
}

public class DemoScanner {
    void scannerdemo() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the id ");
        int id = input.nextInt();

        System.out.println("Enter the name ");
        String name = input.next();

        System.out.println("Enter the age ");
        int age = input.nextInt();

        System.out.println("Enter the salary ");
        double salary = input.nextDouble();

        System.out.println("Enter the post ");
        String post = input.next();

        System.out.println("Enter the address ");
        String address = input.next();

        input.close();

        Employee emp = new Employee(id, name, age, salary, post, address);
        emp.showemployeedetail();
    }

}
