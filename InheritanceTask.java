class Person {
    String name ; 

    void introduce() {
        System.out.println("Hi, I am " + name);
    }

}

class Teacher extends Person {
    String subject ; 

    @Override 
    void introduce() {
        super.introduce();
        System.out.println("Hi, I am " + name + ", I teach " + subject);
    }
}

class Student extends Person {
    int grade ; 

    @Override 
    void introduce() {
        super.introduce();
        System.out.println("Hi, I am " + name + ", I am in grade " + grade);
    }  
}

class Topper extends Student {
    
    void brag() {
        System.out.println("I scored the highest marks in grade " + grade);
    }
    
}

public class InheritanceTask {
    public static void main(String[] args) {
        // Create a Teacher object
        Teacher teacher = new Teacher();
        teacher.name = "Mr. Sharma";
        teacher.subject = "Math";

        teacher.introduce(); // Outputs: Hi, I am Mr. Sharma, I teach Math

        // Create a Student object
        Student student = new Student();
        student.name = "Rahul";
        student.grade = 10;
        student.introduce(); // Outputs: Hi, I am Rahul, I am in grade 10

        // Create a Topper object
        Topper topper = new Topper();
        topper.name = "Priya";
        topper.grade = 10;
        topper.introduce(); // Outputs: Hi, I am Priya, I am in grade 10
        topper.brag(); // Outputs: I scored the highest marks in grade 10
    }
}

// 🧪 TASK: Inheritance - “School System” Example
// 🎓 Problem Statement:
// You are building a basic class hierarchy for a school system with different types of people.

// 🔧 Requirements:
// 🔹 1. Create a class Person with:
// A field String name

// A method void introduce() that prints:
// "Hi, I am " + name

// 🔹 2. Create a class Teacher that inherits from Person:
// Add a field String subject

// Override the introduce() method to print:
// "Hi, I am " + name + ", I teach " + subject

// Call the super.introduce() inside this method too

// 🔹 3. Create a class Student that also inherits from Person:
// Add a field int grade

// Override introduce() similarly

// 🔹 4. Create a class Topper that inherits from Student:
// Add a method void brag() that prints: "I scored the highest marks in grade " + grade

// 🧑‍💻 In your main method:
// Create and use:

// A Teacher object

// A Student object

// A Topper object

// Call their introduce() methods

// Call brag() for the Topper

// ✅ Expected Output (Example):
// css
// Copy code
// Hi, I am Mr. Sharma
// Hi, I am Mr. Sharma, I teach Math
// Hi, I am Rahul
// Hi, I am Rahul, I am in grade 10
// Hi, I am Priya
// Hi, I am Priya, I am in grade 10
// I scored the highest marks in grade 10
// 🧠 Concepts Tested:
// ✅ Inheritance (single, multilevel, hierarchical)

// ✅ Method Overriding

// ✅ super keyword

// ✅ Clean OOP structure

