import java.util.Scanner; 

// Common interface for payment methods 
interface PaymentMethod { 
    void processPayment(double amount); 
}

// Implementation for Credit Card payment
class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

// Implementation for PayPal payment
class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

// Implementation for Bitcoin payment
class BitcoinPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Bitcoin payment of $" + amount);
    }
}

public class Solution { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        
        int choice = scanner.nextInt(); 
        double amount = scanner.nextDouble(); 
        
        // Declare a reference of interface type to demonstrate runtime polymorphism
        PaymentMethod paymentMethod = null; 

        if (choice == 1) {
            paymentMethod = new CreditCardPayment();
        } else if (choice == 2) {
            paymentMethod = new PayPalPayment();
        } else if (choice == 3) {
            paymentMethod = new BitcoinPayment();
        } 

        if (paymentMethod != null) {
            paymentMethod.processPayment(amount);
        }
        
        scanner.close(); 
    }
}