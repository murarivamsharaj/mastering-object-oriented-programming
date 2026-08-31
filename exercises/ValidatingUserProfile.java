import java.util.Scanner;

// Write your class here
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code here
        if (scanner.hasNext()) {
            String name = scanner.next();
            int age = scanner.nextInt();

            if (age >= 1 && age <= 100) {
                Person person = new Person(name, age);
                System.out.println("Name: " + person.name);
                System.out.println("Age: " + person.age);
            } else {
                System.out.println("Invalid Age");
            }
        }

        scanner.close();
    }
}