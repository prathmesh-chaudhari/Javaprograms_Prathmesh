// 13 - april -22
// program for Runtime type polymorphism

class Parent {
    void print () {
        System.out.println("Parent Class");

    }
}

class Child1 extends Parent {
    void print() {
        System.out.println("Class Child1");
    }
}

class Child2 extends Parent {
    void print() {
        System.out.println("Class Child2");
    }
}

public class RunTime_polymorphism {
    public static void main(String args[]) {
        Parent a;

        a = new Child1();
        a.print(); 

        a = new Child2();
        a.print();
    }
}
