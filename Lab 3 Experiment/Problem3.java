// Create an array to manage booking of a conference room. 
// To book the conference room provide details like - date, start time, end time and your name. 
// To check for the availability of the same room, provide the same details ,check and provide the appropriate message.

import java.util.ArrayList;
import java.util.Scanner;

class Booking {
    String room;
    String date;
    int startTime;
    int endTime;
    String name;

    public Booking(String room, String date, int startTime, int endTime, String name) {
        this.room = room;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.name = name;
    }
}

public class Problem3 {
    private static ArrayList<Booking> bookings = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    // Function to check room availability
    private static boolean isAvailable(String room, String date, int start, int end) {
        for (Booking b : bookings) {
            if (b.room.equalsIgnoreCase(room) && b.date.equals(date) && !(end <= b.startTime || start >= b.endTime)) {
                return false; // Time slot overlaps
            }
        }
        return true;
    }

    // Function to book a room
    private static void bookRoom() {
        System.out.print("Enter room name: ");
        String room = scanner.next();
        System.out.print("Enter date (YYYY-MM-DD): ");
        String date = scanner.next();
        System.out.print("Enter start time (24-hour format): ");
        int startTime = scanner.nextInt();
        System.out.print("Enter end time (24-hour format): ");
        int endTime = scanner.nextInt();
        System.out.print("Enter your name: ");
        String name = scanner.next();

        if (startTime >= endTime) {
            System.out.println("Error: Start time must be before end time!");
            return;
        }

        if (isAvailable(room, date, startTime, endTime)) {
            bookings.add(new Booking(room, date, startTime, endTime, name));
            System.out.println("✅ Room '" + room + "' booked successfully for " + name + " on " + date + " from " + startTime + " to " + endTime);
        } else {
            System.out.println("❌ Room '" + room + "' is NOT available for the given time slot.");
        }
    }

    // Function to check availability
    private static void checkAvailability() {
        System.out.print("Enter room name: ");
        String room = scanner.next();
        System.out.print("Enter date (YYYY-MM-DD): ");
        String date = scanner.next();
        System.out.print("Enter start time (24-hour format): ");
        int startTime = scanner.nextInt();
        System.out.print("Enter end time (24-hour format): ");
        int endTime = scanner.nextInt();

        if (isAvailable(room, date, startTime, endTime)) {
            System.out.println("✅ Room '" + room + "' is available for the given time slot.");
        } else {
            System.out.println("❌ Room '" + room + "' is NOT available for the given time slot.");
        }
    }

    // Function to display all bookings
    private static void displayBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings yet.");
            return;
        }
        System.out.println("\n📋 Current Bookings:");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-10s %-12s %-10s %-10s %-10s\n", "Room", "Date", "Start", "End", "Name");
        System.out.println("--------------------------------------------------");
        for (Booking b : bookings) {
            System.out.printf("%-10s %-12s %-10d %-10d %-10s\n", b.room, b.date, b.startTime, b.endTime, b.name);
        }
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n🏢 Conference Room Booking System");
            System.out.println("1. Book a Room");
            System.out.println("2. Check Availability");
            System.out.println("3. View All Bookings");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    bookRoom();
                    break;
                case 2:
                    checkAvailability();
                    break;
                case 3:
                    displayBookings();
                    break;
                case 4:
                    System.out.println("Exiting... Thank you! 👋");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
