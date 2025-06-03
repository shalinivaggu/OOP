abstract class ElectronicDevice {
    abstract void operate();
    public void plugIn() {
        System.out.println("Device plugged in.");
    } 
}

class Television extends ElectronicDevice {
    @Override
    void operate() {
        System.out.println("Television is displaying channels.");
    }
}

class WashingMachine extends ElectronicDevice {
    @Override
    void operate() {
        System.out.println("Washing machine is cleaning clothes.");
    }
}

public class AbstractionTask {
    public static void main(String[] args) {
        Television tv = new Television();
        tv.plugIn(); // Outputs: Device plugged in.
        tv.operate(); // Outputs: Television is displaying channels.

        WashingMachine wm = new WashingMachine();
        wm.plugIn(); // Outputs: Device plugged in.
        wm.operate(); // Outputs: Washing machine is cleaning clothes.

        // ElectronicDevice ed = new ElectronicDevice(); // This line would cause an error because you cannot instantiate an abstract class
        ElectronicDevice ed1 = new Television();   
        ed1.plugIn(); // Outputs: Device plugged in.
        ed1.operate(); // Outputs: Television is displaying channels.

        ElectronicDevice ed2 = new WashingMachine();
        ed2.plugIn(); // Outputs: Device plugged in.
        ed2.operate(); // Outputs: Washing machine is cleaning clothes.

        // ElectronicDevice ed3 = new ElectronicDevice(); // This line would cause an error because you cannot instantiate an abstract class
    }
}