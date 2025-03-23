import java.util.Scanner;

public class Valid_String_Checker{
    public static boolean isValidString(String str) {
        if (str == null || str.isEmpty() || str.charAt(0) == 'b') {
            return false;
        }
        
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == 'a') {
                if (i + 1 < str.length() && str.charAt(i + 1) == 'a') {
                    i++;
                } else if (i + 2 < str.length() && str.charAt(i + 1) == 'b' && str.charAt(i + 2) == 'b') {
                    i += 2;
                } else if (i + 1 < str.length()) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check its validity:");
        String userInput = scanner.nextLine();

        if (isValidString(userInput)) {
            System.out.println("The string is valid.");
        } else {
            System.out.println("The string is invalid.");
        }

        scanner.close();
    }
}