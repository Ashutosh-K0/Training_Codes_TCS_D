import java.util.Scanner;

public class Cyclic_Array_Rotation {
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // In case k is greater than the array size
        reverse(arr, 0, n - 1); // Reverse the entire array
        reverse(arr, 0, k - 1); // Reverse the first k elements
        reverse(arr, k, n - 1); // Reverse the remaining elements
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the value of k (number of rotations):");
        int k = scanner.nextInt();

        rotateArray(arr, k);

        System.out.println("Array after " + k + " rotations:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}