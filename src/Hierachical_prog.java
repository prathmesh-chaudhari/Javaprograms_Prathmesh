

// 13 - april - 22
// program for application of concept Hierachical inheritance

class Vehical  {

    String type, color;

    Vehical (String type, String color) {
        this.type = type;
        this.color = color;
    }
}

class Car extends Vehical{

    String wheel, price, mileage;

    Car(String type, String color, String wheel, String price, String mileage) {
        super(type, color);
        this.wheel = wheel;
        this.price = price;
        this.mileage = mileage;
    }

    void Display() {
        System.out.println("This is information about the car : ");
        System.out.println("car type : " + type);
        System.out.println("car color : " + color);
        System.out.println("car wheel : " + wheel);
        System.out.println("car price : " + price);
        System.out.println("car mileage : " + mileage);
        System.out.println();
    }

}

class Bus extends Vehical{

    String wheel, price, mileage;

    Bus(String type, String color, String wheel, String price, String mileage) {
        super(type, color);
        this.wheel = wheel;
        this.price = price;
        this.mileage = mileage;
    }

    void Display() {
        System.out.println("This is information about the Bus : ");
        System.out.println("Bus type : " + type);
        System.out.println("Bus color : " + color);
        System.out.println("Bus wheel : " + wheel);
        System.out.println("Bus price : " + price);
        System.out.println("Bus mileage : " + mileage);
        System.out.println();
    }

}



public class Hierachical_prog {
    
    public static void main(String args[]) {
        
        Car c = new Car("SUV", "red", "Radial tyres", "20 Lakh Rupees", "50Kmpl");
        c.Display();

        Bus b = new Bus("Double Decker", "Blue/White", "Radial Tyres", "10 Lakh Rupees", "40Kmpl");
        b.Display();

    }

}
