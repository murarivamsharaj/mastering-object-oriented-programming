import java.util.Scanner;

class Employee {
    int basicSalary;

    // Constructor to initialize basic salary
    public Employee(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    // Method to calculate and display salary
    public void calculateSalary() {
        System.out.println("Employee Salary: " + basicSalary);
    }
}

// Derived class inheriting from Employee
// Note: avoids declaring a new field for bonus by directly adding it to basicSalary
class Manager extends Employee {
    
    public Manager(int basicSalary, int bonus) {
        super(basicSalary + bonus);
    }

    @Override
    public void calculateSalary() {
        System.out.println("Manager Salary: " + basicSalary);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int employeeSalary = scanner.nextInt();
        int managerSalary = scanner.nextInt();
        int managerBonus = scanner.nextInt();

        Employee employee = new Employee(employeeSalary);
        Manager manager = new Manager(managerSalary, managerBonus);

        employee.calculateSalary();
        manager.calculateSalary();

        scanner.close();
    }
}