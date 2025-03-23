import java.util.Scanner;
import java.util.Stack;

public class Stack_Permutation {
    public static boolean isStackPermutation(int[] input, int[] output) {
        int n = input.length;
        Stack<Integer> stack = new Stack<>();
        int j = 0;

        for (int i = 0; i < n; i++) {
            stack.push(input[i]); // Push elements from input to the stack

            // Pop elements from the stack if they match the output sequence
            while (!stack.isEmpty() && stack.peek() == output[j]) {
                stack.pop();
                j++;
            }
        }

        // If stack is empty and we have processed all elements, it's a valid permutation
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the sequence:");
        int n = scanner.nextInt();

        int[] input = new int[n];
        int[] output = new int[n];

        System.out.println("Enter the elements of the input sequence:");
        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextInt();
        }

        System.out.println("Enter the elements of the output sequence:");
        for (int i = 0; i < n; i++) {
            output[i] = scanner.nextInt();
        }

        if (isStackPermutation(input, output)) {
            System.out.println("The output sequence is a valid stack permutation of the input sequence.");
        } else {
            System.out.println("The output sequence is NOT a valid stack permutation of the input sequence.");
        }

        scanner.close();
    }
}