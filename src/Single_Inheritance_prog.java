// 13 - april - 22
// program for application of concept single inheritance

class Employee {

    float salary;

    Employee (float salary) {
        this.salary = salary;
    }

    void Display() {
        System.out.println("\nThe salary of the employee without bonus is " + salary + "\n");
    }
}

class Bonus extends Employee {
    
    float bonus;

    Bonus (float salary, float bonus) {
        super (salary);
        this.bonus = bonus;
    }

    void Add () {
        salary += bonus;
    }

    void Display () {
        System.out.println("\nThe salary of the employee with bonus is " + salary + "\n");
    }

}

public class Single_Inheritance_prog {
    
    public static void main( String args[]) {
        
        Bonus b = new Bonus(33333.33f, 333.33f);
        b.Add();
        b.Display();
    }
}
