// 15 - april - 2022


interface Drawable {
    void draw();

}

interface Print_able {
    void print();
}

class Rectanglee implements Drawable, Print_able {
    public void draw () {
        System.out.println("\nDrawing Rectangle!!!");
    }
    public void print() {
        System.out.println("\nPrinting Rectangle!!");
    }
}

class Circlee implements Drawable, Print_able{
    public void draw() {
        System.out.println("\nDrawing Circle!!!");
    }
    public void print() {
        System.out.println("\nPrinting Circle!!");        
    }
}

public class Interface_prog_1 {
    public static void main(String[] args) {
        Rectanglee r = new Rectanglee();
        r.draw();   r.print();


        Circlee c = new Circlee();
        c.draw();   c.print();
    }
}
