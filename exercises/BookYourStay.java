import java.util.Scanner;

class HotelBooking {
    int nights;
    int guests;
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instantiate the HotelBooking object
        HotelBooking booking = new HotelBooking();

        // Assign values from user input
        booking.nights = scanner.nextInt();
        booking.guests = scanner.nextInt();

        // Validate ranges: nights [1, 25] and guests [1, 5]
        if (booking.nights >= 1 && booking.nights <= 25 && booking.guests >= 1 && booking.guests <= 5) {
            System.out.println("Booking Confirmed");
        } else {
            System.out.println("Booking Canceled");
        }

        scanner.close();
    }
}