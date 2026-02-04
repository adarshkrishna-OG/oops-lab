import java.util.Scanner;

class ComplexAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real and imaginary part of first complex number: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.print("Enter real and imaginary part of second complex number: ");
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        double real = a + c;
        double imag = b + d;

        if (imag >= 0) {
            System.out.println("Sum = " + real + " + " + imag + "i");
        } else {
            System.out.println("Sum = " + real + " - " + (-imag) + "i");
        }

        sc.close();
    }
}
        