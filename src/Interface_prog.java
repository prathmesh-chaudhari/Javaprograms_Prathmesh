// 15 - april - 2022

interface Printable {
    void print ();
}

class Printing implements Printable {

    @Override public void print() {
        System.out.println("print java progress");
    }
}


public class Interface_prog {
    public static void main(String[] args) {
        Printing p1 = new Printing();
        p1.print();
    }
}
