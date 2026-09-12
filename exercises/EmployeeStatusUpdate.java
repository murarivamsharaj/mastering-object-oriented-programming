import java.util.Scanner;

public class Solution {
    
    // Method to print default system status
    public void PrintDefaultStatus() {
        System.out.print("Employee statuses: ");
    }
    
    // Method to update employee status
    public void UpdateStatus(String name, boolean isActive) {
        String status = isActive ? "active." : "inactive.";
        System.out.println("Employee " + name + " is currently " + status);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNext()) {
            String name = scanner.next();
            if (scanner.hasNextBoolean()) {
                boolean isActive = scanner.nextBoolean();
                
                Solution solution = new Solution();
                solution.PrintDefaultStatus();
                solution.UpdateStatus(name, isActive);
            }
        }
        
        scanner.close();
    }
}