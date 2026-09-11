import java.util.Scanner;

public class Solution {
    
    // Method to determine if a number is even, odd, or invalid
    public static String checkEvenOrOdd(int number) {
        if (number < 0) {
            return "Invalid input";
        } else if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println(checkEvenOrOdd(number));
        } else {
            System.out.println("Invalid input");
        }
        
        scanner.close();
    }
}