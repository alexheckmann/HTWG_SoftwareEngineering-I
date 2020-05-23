package exercise04.task02;

import java.util.Scanner;

public class Registration {
    private static String suggest(String emailAddress) {
        String username = emailAddress.substring(0, emailAddress.indexOf('@'));
        return username;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your email:");
        String emailAddress = sc.nextLine();
        sc.close();
        String regExEmail = ".{3,15}@.*\\.(de|org|ch)";

        if (emailAddress.matches(regExEmail)) {
            System.out.println("Email valid");
            String suggestion = suggest(emailAddress);
            System.out.println("Username suggestion: " + suggestion);

        } else {
            System.out.println("Email invalid");
        }
    }
}
