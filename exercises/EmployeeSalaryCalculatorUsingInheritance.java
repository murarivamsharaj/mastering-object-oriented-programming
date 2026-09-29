import java.util.Scanner;

// Implement base class Employee1
class Employee1 {
    protected String name;

    public Employee1(String name) {
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Designation: Employee");
    }
}

// Implement derived class Manager
class Manager extends Employee1 {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void displayDetails() {
        System.out.println("Manager Name: " + this.name);
        System.out.println("Designation: Manager");
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String employeeName = scanner.next();
        String managerName = scanner.next();

        Employee1 employee = new Employee1(employeeName);
        Manager manager = new Manager(managerName);

        employee.displayDetails();
        manager.displayDetails();
        
        scanner.close();
    }
}