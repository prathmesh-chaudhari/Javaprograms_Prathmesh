// 13 - april - 22
// program for application of concept Polymorphism ----- COMPILE POLYMORPHISM   Method Overloading  Function Overloading
// shape    area()
//Circle    radius  area()      Rectangle   weight, height  area()      Square  side    area()
//

class Shape_ {

    static String Area() {
        return ("\nThis program calculates area of the given shape.\n");
    }
}

class Circle_ extends Shape_ {
    // static float radius;

    // Circle(float radius) {
    // this.radius = radius;
    // }

    static float Area(float radius) {
        radius = 3.14f * radius * radius;
        return radius;
    }
}

class Rectangle_ extends Shape_ {
    // float width, height;

    // Rectangle(float w, float h) {
    // this.width = w;
    // this.height = h;
    // }

    static float Area(float width, float height) {
        width = width * height;
        return width;
    }
}

class Square_ extends Shape_ {

    // float side;

    // Square(float side) {
    // this.side = side;
    // }

    static float Area(float side) {
        side = side * side;
        return side;
    }

}

public class Polymorphism_prog {
    public static void main(String[] args) {
        System.out.println(Shape_.Area());
        System.out.println("The area of circle is " + Circle_.Area(3.0f));
        System.out.println("The area of rectangle is " + Rectangle_.Area(3.0f, 4.0f));
        System.out.println("The area of square is " + Square_.Area(5.0f));
    }
}
