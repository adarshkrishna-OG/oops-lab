import java.util.Scanner;

class Area {

    // Area of Circle
    void calculateArea(double radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }

    // Area of Rectangle
    void calculateArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }

    // Area of Square
    void calculateArea(int side) {
        int area = side * side;
        System.out.println("Area of Square = " + area);
    }

    // Area of Triangle
    void calculateArea(double base, double height, int x) {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle = " + area);
    }
}

public class MethodOverloadingArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Area obj = new Area();

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        obj.calculateArea(r);

        System.out.print("\nEnter length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        obj.calculateArea(l, b);

        System.out.print("\nEnter side of square: ");
        int s = sc.nextInt();
        obj.calculateArea(s);

        System.out.print("\nEnter base and height of triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        obj.calculateArea(base, height, 1);

        sc.close();
    }
}