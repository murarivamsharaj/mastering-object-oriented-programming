import java.util.Scanner;

class Student {
    static int count = 0;
    static double total = 0.0;
    
    double grade;

    public Student(double grade) {
        this.grade = grade;
        count++;
        total += grade;
    }

    public static double getAverage() {
        if (count == 0) return 0.0;
        return total / count;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student.count = 0;
        Student.total = 0.0;

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                double g = scanner.nextDouble();
                new Student(g);
            }
            
            double avg = Student.getAverage();
            System.out.printf("%.2f\n", avg);
        }

        scanner.close();
    }
}