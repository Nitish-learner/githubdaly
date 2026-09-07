import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char ch : password.toCharArray()) {

            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else {
                hasSpecialChar = true;
            }
        }

        int score = 0;

        if (password.length() >= 8) score++;
        if (hasUpperCase) score++;
        if (hasLowerCase) score++;
        if (hasDigit) score++;
        if (hasSpecialChar) score++;

        System.out.println("\nPassword Analysis:");

        if (score <= 2) {
            System.out.println("Password Strength: WEAK ❌");
        } else if (score <= 4) {
            System.out.println("Password Strength: MEDIUM ⚠️");
        } else {
            System.out.println("Password Strength: STRONG ✅");
        }

        scanner.close();
    }
}
