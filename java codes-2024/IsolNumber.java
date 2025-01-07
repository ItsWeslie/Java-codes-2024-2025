import java.util.Scanner;

public class IsolNumber {

    public static boolean isIsolNumber(String num) {
        // Loop through each character in the string
        for (int i = 0; i < num.length(); i++) {
            // Check if the current character is '0'
            if (num.charAt(i) == '0') {
                // Check if it's at the first or last position, or not surrounded by '1'
                if (i == 0 || i == num.length() - 1 || num.charAt(i - 1) != '1' || num.charAt(i + 1) != '1') {
                    return false; // If any condition fails, it is not an ISOL number
                }
            }
        }
        return true; // All '0's are surrounded by '1's
    }

    public static void main(String[] args) {
        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = scanner.nextLine();
        scanner.close();

        // Check if the number is an ISOL number and print the result
        if (isIsolNumber(num)) {
            System.out.println(num + " is an ISOL number.");
        } else {
            System.out.println(num + " is not an ISOL number.");
        }
    }
}
