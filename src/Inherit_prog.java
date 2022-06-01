
// 12 - April - 22
// program for single inheritance



class Bicycle {
    
    int gear;
    int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake (int decrement) {
        speed -= decrement;
    }

    public void speedUp (int increment) {
        speed += increment;
    } 

    public String toString() {
        return ("The speed of the bicycle is " + speed + ". The number of gear is " + gear + ".");
    }

}

class MountainBike extends Bicycle {
    int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public void seatHeight(int newValue) {
        seatHeight = newValue;
    }

    @Override public String toString () {
        return (super.toString() + " seat height is " + seatHeight + ".");
    }
}

public class Inherit_prog {
    public static void main(String args[]) {
        Bicycle b = new Bicycle(3, 45);
        MountainBike mb = new MountainBike (4, 60, 5);
        b.applyBrake(20);
        
        System.out.println(b.toString());
        mb.speedUp(40);
        System.out.println(mb.toString());
        
    }

}