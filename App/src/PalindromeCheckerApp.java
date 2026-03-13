import java.util.Scanner;

public class PalindromeCheckerApp {

    // Method to check palindrome ignoring spaces and case
    public static boolean isPalindrome(String input) {

        // Normalize string: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = normalized.length() - 1;

        // Check characters from both ends
        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The given string is a palindrome (ignoring spaces and case).");
        } else {
            System.out.println("The given string is not a palindrome.");
        }

        scanner.close();
    }
}