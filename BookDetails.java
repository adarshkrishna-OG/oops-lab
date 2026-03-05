import java.util.Scanner;

// Step 2: Publisher class
class Publisher {
    String publisher_name;
}

// Step 3: Book class inheriting Publisher
class Book extends Publisher {
    String book_name;
    String author;
}

// Step 5: Literature class inheriting Book
class Literature extends Book {
    String type;

    void readData(Scanner sc) {
        System.out.print("Enter Publisher Name: ");
        publisher_name = sc.nextLine();

        System.out.print("Enter Book Name: ");
        book_name = sc.nextLine();

        System.out.print("Enter Author Name: ");
        author = sc.nextLine();

        type = "Literature";
    }

    void display() {
        System.out.println("\nCategory: " + type);
        System.out.println("Publisher Name: " + publisher_name);
        System.out.println("Book Name: " + book_name);
        System.out.println("Author: " + author);
        System.out.println("------------------------");
    }
}

// Step 7: Fiction class inheriting Book
class Fiction extends Book {
    String type;

    void readData(Scanner sc) {
        System.out.print("Enter Publisher Name: ");
        publisher_name = sc.nextLine();

        System.out.print("Enter Book Name: ");
        book_name = sc.nextLine();

        System.out.print("Enter Author Name: ");
        author = sc.nextLine();

        type = "Fiction";
    }

    void display() {
        System.out.println("\nCategory: " + type);
        System.out.println("Publisher Name: " + publisher_name);
        System.out.println("Book Name: " + book_name);
        System.out.println("Author: " + author);
        System.out.println("------------------------");
    }
}

// Step 11: Main class
public class BookDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 12
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Step 13
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter Book Category (1-Literature, 2-Fiction): ");
            int choice = sc.nextInt();
            sc.nextLine();

            // Step 14
            if (choice == 1) {
                Literature l = new Literature();
                l.readData(sc);
                l.display();
            } 
            else if (choice == 2) {
                Fiction f = new Fiction();
                f.readData(sc);
                f.display();
            } 
            else {
                System.out.println("Invalid Category");
            }
        }

        sc.close();
    }
}