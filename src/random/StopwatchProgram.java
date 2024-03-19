package random;

import java.util.Scanner;

public class StopwatchProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press Enter to start the stopwatch...");
        scanner.nextLine(); // Wait for user to press Enter
        long startTime = System.currentTimeMillis(); // Record start time
        System.out.println("Stopwatch started.");

        System.out.println("Press Enter to stop the stopwatch...");
        scanner.nextLine(); // Wait for user to press Enter
        long stopTime = System.currentTimeMillis(); // Record stop time
        System.out.println("Stopwatch stopped.");

        long elapsedTime = stopTime - startTime; // Calculate elapsed time
        long seconds = elapsedTime / 1000; // Convert milliseconds to seconds
        long milliseconds = elapsedTime % 1000; // Calculate remaining milliseconds

        System.out.println("Elapsed Time: " + seconds + " seconds and " + milliseconds + " milliseconds.");

        scanner.close();
    }
}

