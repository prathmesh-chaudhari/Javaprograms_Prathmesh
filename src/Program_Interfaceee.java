
// 15 - april - 22

interface Create {
    void create ();
    static int cube (int c)  {
        return (c*c*c);
    }
}

class Geometry implements Create  {
    public void create () {
        System.out.println("\nDrawing Rectangle !!!");
    }
}



public class Program_Interfaceee {
    public static void main(String[] args) {
        Create cr = new Geometry();
        cr.create();
        System.out.println(Create.cube(8));
    }
}
