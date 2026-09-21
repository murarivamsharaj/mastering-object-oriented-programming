import java.util.Scanner;

class Shape {
    public int calculateArea() {
        return 0;
    }
}

class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int calculateArea() {
        // Area = Math.PI * radius^2 rounded to the nearest integer (Math.PI * 25 ≈ 78.5398 -> 78 via (int) casting)
        return (int) (Math.PI * radius * radius);
    }
}

class Rectangle extends Shape {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public int calculateArea() {
        return length * breadth;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }

        int choice = scanner.nextInt();

        if (choice == 1) {
            if (scanner.hasNextInt()) {
                int radius = scanner.nextInt();
                if (radius >= 0 && radius < 100) {
                    Circle circle = new Circle(radius);
                    System.out.println("Area of Circle: " + circle.calculateArea());
                } else {
                    System.out.println("Invalid input");
                }
            } else {
                System.out.println("Invalid input");
            }
        } else if (choice == 2) {
            if (scanner.hasNextInt()) {
                int length = scanner.nextInt();
                if (scanner.hasNextInt()) {
                    int breadth = scanner.nextInt();
                    if (length >= 0 && length < 100 && breadth >= 0 && breadth < 100) {
                        Rectangle rectangle = new Rectangle(length, breadth);
                        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
                    } else {
                        System.out.println("Invalid input");
                    }
                } else {
                    System.out.println("Invalid input");
                }
            } else {
                System.out.println("Invalid input");
            }
        } else {
            System.out.println("Invalid input");
        }

        scanner.close();
    }
}