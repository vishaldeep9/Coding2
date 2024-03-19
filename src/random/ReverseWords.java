package random;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Split the input string into words
        String[] words = input.split("\\s+");

        // Reverse each word and append it to the result
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            result.append(reversedWord).append(" ");
        }

        // Print the reversed string
        System.out.println("Reversed string:");
        System.out.println(result.toString().trim());

        scanner.close();
    }
}

