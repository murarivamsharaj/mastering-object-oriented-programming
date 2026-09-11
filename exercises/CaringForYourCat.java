import java.util.Scanner;

class Cat {
    int age;
    int weight;

    Cat(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    boolean isHealthy() {
        return (age >= 1 && age <= 15) && (weight >= 2 && weight <= 10);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        int weight = scanner.nextInt();

        Cat cat = new Cat(age, weight);

        System.out.println("Age: " + cat.age);
        System.out.println("Weight: " + cat.weight);

        if (cat.isHealthy()) {
            System.out.println("Health Status: Healthy");
        } else {
            System.out.println("Health Status: Unhealthy");
        }

        scanner.close();
    }
}