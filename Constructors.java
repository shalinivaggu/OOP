class book {
    String title;
    String author;
    double price;

    book() {
        this("Unknown", "Unknown", 0.0);
        System.out.println("Book created with default values");
    }

    book(String title) {
        this(title, "Unknown", 0.0);
        System.out.println("Book created with title: " + title);
    }

    book(String title, String author) {
       this(title, author, 0.0);
        System.out.println("Book created with title: " + title + " and author: " + author);
    }

    book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("Book created with title: " + title + ", author: " + author + " and price: $" + price);
    }
}

public class Constructors {
    public static void main(String[] args) {
        book book1 = new book(); // Calls the default constructor
        book book2 = new book("1984"); // Calls the constructor with title
        book book3 = new book("To Kill a Mockingbird", "Harper Lee"); // Calls the constructor with title and author
        book book4 = new book("The Great Gatsby", "F. Scott Fitzgerald", 10.99); // Calls the constructor with title, author, and price

        System.out.println("Book 1: " + book1.title + ", " + book1.author + ", $" + book1.price);
        System.out.println("Book 2: " + book2.title + ", " + book2.author + ", $" + book2.price);
        System.out.println("Book 3: " + book3.title + ", " + book3.author + ", $" + book3.price);
        System.out.println("Book 4: " + book4.title + ", " + book4.author + ", $" + book4.price);
    }
}
