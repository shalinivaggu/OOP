class Car {
    String color; 
    int speed; 

    void drive() {
        System.out.println("The car is driving!");
    }

    void stop() {
        System.out.println("The car is stopped");
    }
}

public class Intro {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.speed = 60;

        System.out.println("Car color: " + myCar.color);
        System.out.println("Car speed: " + myCar.speed + " km/h");

        myCar.drive();
        myCar.stop();
    }
}
    