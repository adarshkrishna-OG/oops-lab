package graphics;

public class Rectangle implements Shape {
    double l, b;

    public Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    public double area() {
        return l * b;
    }
}