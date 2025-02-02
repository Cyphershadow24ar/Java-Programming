// 1. Create an 2D array to store the time and value of different stocks with their respective
// time. Print their values at the respective timed intervals.

public class Problem1 {
    public static void main(String[] args) {
        // Define a 2D array: Each row represents a time interval, each column a stock value
        int[][] stockData = {
            {9, 100, 200, 300},  // 9 AM: Stock values of 3 different stocks
            {10, 105, 210, 290}, // 10 AM
            {11, 110, 220, 280}, // 11 AM
            {12, 120, 230, 270}, // 12 PM
            {13, 125, 240, 260}  // 1 PM
        };

        // Print stock values at respective time intervals
        System.out.println("Time\tStock1\tStock2\tStock3");
        System.out.println("--------------------------------");

        for (int i = 0; i < stockData.length; i++) {
            System.out.printf("%-5d", stockData[i][0]); // Print time
            for (int j = 1; j < stockData[i].length; j++) {
                System.out.printf("%-8d", stockData[i][j]); // Print stock values
            }
            System.out.println();
        }
    }
}

