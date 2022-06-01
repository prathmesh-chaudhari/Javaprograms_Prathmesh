// 13 - april - 22
// program for application of concept Polymorphism -----  RUNTIME POLYMORPHISM  Method Overriding
// shape    area()
//Circle    radius  area()      Rectangle   weight, height  area()      Square  side    area()
//

class Shape {

    void Area() {
        System.out.println("\nThis program calculates area of the given shape.\n");
    }
}

class Circle extends Shape {
    float radius;

    Circle(float radius) {
        this.radius = radius;
    }

    void Area() {
        radius = 3.14f * radius * radius;
        System.out.println("Circle area : " + radius);
    }
}

class Rectangle extends Shape {
    float width, height;

    Rectangle(float w, float h) {
        this.width = w;
        this.height = h;
    }

    void Area() {
        width = width * height;
        System.out.println("Rectangle area : " + width);

    }
}

class Square extends Shape {

    float side;

    Square(float side) {
        this.side = side;
    }

    void Area() {
        side = side * side;
        System.out.println("Square area : " + side);

    }

}

public class Polymor_prog {
    public static void main(String[] args) {
        Shape s;
        s = new Shape();
        s.Area();

        s = new Circle(3.0f);
        s.Area();

        s = new Rectangle(3.0f, 4.0f);
        s.Area();

        s = new Square(3.0f);
        s.Area();

        // System.out.println(Shape.Area());
        // System.out.println("The area of circle is " + Circle.Area(3.0f));
        // System.out.println("The area of rectangle is " + Rectangle.Area(3.0f, 4.0f));
        // System.out.println("The area of square is " + Square.Area(5.0f));
    }
}
