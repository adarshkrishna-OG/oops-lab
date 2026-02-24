import java.util.Scanner;

public class StringBufferOperations {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter initial string: ");
        String input = sc.nextLine();
        StringBuffer sb = new StringBuffer(input);
        
        
        System.out.println("Capacity of StringBuffer: " + sb.capacity());
        
        
        sb.reverse();
        String reversedUpper = sb.toString().toUpperCase();
        System.out.println("Reversed and Uppercase String: " + reversedUpper);
        
        
        System.out.print("Enter another string to append: ");
        String appendStr = sc.nextLine();
        sb.append(appendStr);
        
        System.out.println("Final String after appending: " + sb);
        
        sc.close();
    }
}