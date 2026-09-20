import java.util.Scanner;

public class Solution {
    
    // Static variable to track the total number of operations
    static int operationCount = 0;
    
    // Static method for addition
    public static int add(int a, int b) {
        operationCount++;
        return a + b;
    }
    
    // Static method for subtraction
    public static int subtract(int a, int b) {
        operationCount++;
        return a - b;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        int sum = add(num1, num2);
        int difference = subtract(num1, num2);
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Operations performed: " + operationCount);
        
        scanner.close();
    }
}