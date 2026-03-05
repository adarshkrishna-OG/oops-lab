import java.util.Scanner;

class Student {
    int roll_no;
    String name;
    int academic_score;

    void readStudent(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        roll_no = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Academic Score: ");
        academic_score = sc.nextInt();
    }
}


interface Sports {
    void readSports(Scanner sc);
}


class Result extends Student implements Sports {

    int sports_score;

    public void readSports(Scanner sc) {
        System.out.print("Enter Sports Score: ");
        sports_score = sc.nextInt();
    }

    void display() {
        System.out.println("\nStudent Result");
        System.out.println("Roll Number: " + roll_no);
        System.out.println("Name: " + name);
        System.out.println("Academic Score: " + academic_score);
        System.out.println("Sports Score: " + sports_score);
    }
}


public class StudentResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Result r = new Result();

        r.readStudent(sc);
        r.readSports(sc);
        r.display();

        sc.close();
    }
}