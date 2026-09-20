import java.util.Scanner;

public class Solution {
    
    // Variables to track the counts of even and odd numbers
    static int evenCount = 0;
    static int oddCount = 0;
    
    // Method to process a number and update the appropriate count
    public static void processNumber(int num) {
        if (num % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the total number of integers to process
        int n = scanner.nextInt();
        
        // Process each integer
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            processNumber(num);
        }
        
        // Display the results
        System.out.println("Even Numbers Count: " + evenCount);
        System.out.println("Odd Numbers Count: " + oddCount);
        
        scanner.close();
    }
}