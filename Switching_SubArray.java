import java.util.Scanner;

public class LongestSwitchingSubarray {

    public static int findLongestSwitchingSubarray(int[] arr) {
        int n = arr.length;
        int maxLength = 0;
        int currentLength = 1;  // Start with the first element

        // Iterate through the array
        for (int i = 1; i < n; i++) {
            if ((i % 2 == 0 && arr[i] == arr[i - 2]) || (i % 2 != 0 && arr[i] == arr[i - 2])) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;  // Reset the length when the condition is violated
            }
        }

        // Final check for the last subarray
        maxLength = Math.max(maxLength, currentLength);

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find the length of the longest switching contiguous subarray
        int result = findLongestSwitchingSubarray(arr);

        // Output the result
        System.out.println("Length of the longest switching contiguous subarray: " + result);

        sc.close();
    }
}
