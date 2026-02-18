import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
  
        System.out.print("Enter second string (for concatenation): ");
        String str2 = sc.nextLine();

    
        System.out.println("Length of first string : " + str1.length());
        System.out.println("2nd character: " + str1.charAt(1));
        System.out.println("4th character: " + str1.charAt(3));
        System.out.println("Substring from index 2: " + str1.substring(2));
        System.out.println("Substring (1,5): " + str1.substring(1, 5));
        System.out.println("Concatenation: " + str1.concat(str2));
        System.out.println("Lowercase: " + str1.toLowerCase());
        System.out.println("Uppercase: " + str1.toUpperCase());

        sc.close();
    }
}
