import java.util.Scanner;

// Reverse String Program
// Author: Nitish Kumar

public class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }

        System.out.println("Original String: " + text);
        System.out.println("Reversed String: " + reverse);

        sc.close();
    }
}