import java.util.Scanner;

// Parent Class
class EmployeeBase {
    int empid;
    String name;
    double salary;
    String address;

    // Constructor to initialize Employee data
    EmployeeBase(int empid, String name, double salary, String address) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

// Child Class
class Teacher extends EmployeeBase {
    String department;
    String subject;

    // Constructor for Teacher
    Teacher(int empid, String name, double salary, String address,
            String department, String subject) {

        super(empid, name, salary, address); // call parent constructor
        this.department = department;
        this.subject = subject;
    }

    // Display function
    void display() {
        System.out.println("Employee ID : " + empid);
        System.out.println("Name        : " + name);
        System.out.println("Salary      : " + salary);
        System.out.println("Address     : " + address);
        System.out.println("Department  : " + department);
        System.out.println("Subject     : " + subject);
        System.out.println("-----------------------------");
    }
}

// Main Class
public class TeacherDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Array of objects
        Teacher[] t = new Teacher[n];

        // Reading teacher details
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Teacher " + (i + 1));

            System.out.print("Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            System.out.print("Subject Taught: ");
            String subject = sc.nextLine();

            // Creating object
            t[i] = new Teacher(id, name, salary, address, dept, subject);
        }

        // Display teacher details
        System.out.println("\nTeacher Details:");
        for (int i = 0; i < n; i++) {
            t[i].display();
        }

        sc.close();
    }
}