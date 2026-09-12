import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    
    // Method with no arguments to print the default message prefix
    public void printDefaultMessage() {
        System.out.print("Welcome to the channel:");
    }
    
    // Method with a name argument to append/print each name
    public void printName(String name) {
        System.out.print(" " + name);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tokens = new ArrayList<>();
        
        while (scanner.hasNext()) {
            tokens.add(scanner.next());
        }
        scanner.close();
        
        // Must contain exactly two names
        if (tokens.size() != 2) {
            System.out.println("Invalid input");
            return;
        }
        
        String name1 = tokens.get(0);
        String name2 = tokens.get(1);
        
        // The problem mentions "shorter than three characters" in the main description.
        // A name is invalid if its length is strictly less than 3 (< 3).
        if (name1.length() < 3 || name2.length() < 3) {
            System.out.println("Invalid input");
            return;
        }
        
        Solution sol = new Solution();
        sol.printDefaultMessage();
        sol.printName(name1);
        sol.printName(name2);
        System.out.println();
    }
}