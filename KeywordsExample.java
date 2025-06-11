abstract class Vehicle {
    String brand; 
    int speed;
    static int vechicleCount ;// static variable, shared across all instances
    
    Vehicle(String brand , int speed) {
        this.brand = brand; // Use of 'this' to refer to the instance variable
        this.speed = speed;
        vechicleCount++; // Increment the static variable for each new instance
        System.out.println("Vehicle created. Total number of vehicles : " + vechicleCount);
    }
   
    abstract void start();
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }
}

interface EcoFriendly {
    void showEcoRating();
    
}

class Car extends Vehicle {
    String model;   
    public static final int MAX_SPEED = 200; // final variable, cannot be changed

    Car(String brand, int speed , String model) {
        super(brand, speed);
        this.model = model ; // Call the constructor of the superclass Vehicle
    }

    @Override
    void start() {
        System.out.println("Car is starting which is a " + brand + " " + model);
    }

    @Override
    void displayInfo() {
        super.displayInfo();
    }
}

class ElectricCar extends Car implements  EcoFriendly {
    int batteryPercentage;

    ElectricCar(String brand, int speed, String model, int batteryPercentage) {
        super(brand, speed, model);
        this.batteryPercentage = batteryPercentage; // ← this usage
    }

    public void setBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }

    @Override
    public void showEcoRating() {
        System.out.println("Eco Rating: Excellent");        
    }
    
}


public class KeywordsExample {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 150, "Corolla");
        myCar.start(); // Outputs: Car is starting which is a Toyota Corolla
        myCar.displayInfo(); // Outputs: Brand: Toyota, Speed: 150

        ElectricCar myElectricCar = new ElectricCar("Tesla", 180, "Model S", 85);
        myElectricCar.start(); // Outputs: Car is starting which is a Tesla Model S
        myElectricCar.displayInfo(); // Outputs: Brand: Tesla, Speed: 180
        myElectricCar.showEcoRating(); // Outputs: Eco Rating: Excellent
    }
}
