import java.util.Scanner;

class Employee {
    int eno;
    String ename;
    double esalary;

    // Method to read employee data
    void readData(Scanner sc) {
        System.out.print("Enter Employee Number: ");
        eno = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Employee Name: ");
        ename = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        esalary = sc.nextDouble();
    }

    // Method to display employee data
    void display() {
        System.out.println("Employee Number: " + eno);
        System.out.println("Employee Name: " + ename);
        System.out.println("Employee Salary: " + esalary);
    }
}

public class EmployeeSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee emp[] = new Employee[n];

        // Create objects and read data
        for(int i = 0; i < n; i++) {
            emp[i] = new Employee();
            System.out.println("\nEnter details of Employee " + (i+1));
            emp[i].readData(sc);
        }

        // Search by employee number
        System.out.print("\nEnter employee number to search: ");
        int searchEno = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < n; i++) {
            if(emp[i].eno == searchEno) {
                System.out.println("\nEmployee Found:");
                emp[i].display();
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Employee Not Found");
        }

        sc.close();
    }
}