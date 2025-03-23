import java.util.Scanner;

public class Array_Sum_7 {
    public static boolean hasLucky7(int[] array) {
        int length = array.length;
        // Loop through all possible triplets in the array
        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (array[i] + array[j] + array[k] == 7) {
                        System.out.println("Found elements: " + array[i] + ", " + array[j] + ", " + array[k]);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        if (hasLucky7(array)) {
            System.out.println("The array has a triplet whose sum is 7.");
        } else {
            System.out.println("No triplet with sum 7 was found in the array.");
        }

        scanner.close();
    }
}