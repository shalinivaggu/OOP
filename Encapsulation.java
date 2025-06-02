class Student {
    private String name; 
    private int rollno;
    private int marks;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getRollno() {
        return rollno;
    }

    public void setMarks(int marks) {
        if(marks < 0 || marks > 100) {
            System.out.println("Marks must be between 0 and 100");
        } else {
            this.marks = marks;
        }
    }

    public int getMarks() {
        return marks;
    }

    public void displayDetails() {
        System.out.println("name: " + name);
        System.out.println("roll number: " + rollno);
        System.out.println("marks: " + marks);
    } 
}

public class Encapsulation {
    public static void main(String[] args) {
        
        Student s = new Student();

        s.setName("mamatha");
        s.setRollno(1);
        s.setMarks(90);

        s.displayDetails();

        // Attempting to set invalid marks
        s.setMarks(110); // This should print an error message
    }
}
