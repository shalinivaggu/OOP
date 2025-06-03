interface vehicle {
    void start();
    void stop();
}

class Car implements vehicle {
    public void start() {
        System.out.println("Car is starting");
    }
    
    public void stop() {
        System.out.println("Car is stopping");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Car myCar = new Car(); 
        myCar.start(); // Outputs: Car is starting
        myCar.stop();  // Outputs: Car is stopping
        // vehicle myVehicle = new vehicle(); // This line would cause an error because you cannot instantiate an interface
    }
}
