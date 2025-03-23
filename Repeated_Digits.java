import java.util.Scanner;

public class Repeated_Digits {
    // Function to check if a number has repeated digits
    public static boolean hasRepeatedDigits(int num) {
        boolean[] digits = new boolean[10]; // Array to track digits (0-9)
        while (num > 0) {
            int digit = num % 10;
            if (digits[digit]) {
                return true; // Digit already encountered
            }
            digits[digit] = true;
            num /= 10;
        }
        return false;
    }

    // Function to count numbers without repeated digits
    public static int countUniqueDigitNumbers(int n1, int n2) {
        int count = 0;
        for (int i = n1; i <= n2; i++) {
            if (!hasRepeatedDigits(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of n1 (lower bound):");
        int n1 = scanner.nextInt();
        System.out.println("Enter the value of n2 (upper bound):");
        int n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.println("Invalid input! Make sure n1 is less than or equal to n2.");
        } else {
            int result = countUniqueDigitNumbers(n1, n2);
            System.out.println("The number of integers without repeated digits between " + n1 + " and " + n2 + " is: " + result);
        }

        scanner.close();
    }
}