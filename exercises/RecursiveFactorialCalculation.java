import java.util.Scanner;

public class Solution {
    
    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            
            // Validate constraints: 0 <= n <= 12
            if (n < 0 || n > 12) {
                System.out.println("Invalid input");
            } else {
                System.out.println(factorial(n));
            }
        } else {
            System.out.println("Invalid input");
        }
        
        scanner.close();
    }
}