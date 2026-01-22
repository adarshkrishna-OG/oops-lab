class Product {
    int pcode;
    String pname;
    double price;

    // Constructor
    Product(int pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    // Method to display product details
    void display() {
        System.out.println("Product Code: " + pcode);
        System.out.println("Product Name: " + pname);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        // Creating 3 product objects
        Product p1 = new Product(101, "Laptop", 55000);
        Product p2 = new Product(102, "Mobile", 30000);
        Product p3 = new Product(103, "Tablet", 20000);

        // Assume p1 has the lowest price initially
        Product lowest = p1;

        // Compare prices
        if (p2.price < lowest.price) {
            lowest = p2;
        }
        if (p3.price < lowest.price) {
            lowest = p3;
        }

        // Display product with lowest price
        System.out.println("Product with the lowest price:");
        lowest.display();
    }
}
