import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size (square matrix)
        System.out.print("Enter order of matrix (rows = columns): ");
        int n = sc.nextInt();

        int[][] a = new int[n][n];
        int[][] b = new int[n][n];

        // Read first matrix
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Read second matrix
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Check first matrix
        boolean symmetricA = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != a[j][i]) {
                    symmetricA = false;
                    break;
                }
            }
        }

        // Check second matrix
        boolean symmetricB = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (b[i][j] != b[j][i]) {
                    symmetricB = false;
                    break;
                }
            }
        }

        // Output result
        if (symmetricA)
            System.out.println("First matrix is Symmetric");
        else
            System.out.println("First matrix is Not Symmetric");

        if (symmetricB)
            System.out.println("Second matrix is Symmetric");
        else
            System.out.println("Second matrix is Not Symmetric");

        sc.close();
    }
}
