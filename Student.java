class Stud{
    String name ; 
    int rollno;
    int marks;

    void displayDetails() {
        System.out.println("name: " + name);
        System.out.println("roll number: " + rollno);
        System.out.println("marks: " + marks);

    }
}

public class Student {
    public static void main(String[] args) {
         Stud s = new Stud();

        s.name = "mamatha";
        s.rollno = 1;
        s.marks = 90;

        s.displayDetails();
    }
   
}
