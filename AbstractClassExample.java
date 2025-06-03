abstract class Animal {
    abstract void sound();

    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Outputs: Bark
        dog.eat();   // Outputs: This animal eats food.
        // Animal animal = new Animal(); // This line would cause an error because you cannot instantiate an abstract class
    }
}
