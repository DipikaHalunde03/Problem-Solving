package Accenture_coding_q;

import java.util.Scanner;

public class CharacterEncryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Character and key
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        System.out.print("Enter a key (integer): ");
        int key = scanner.nextInt();

        // Encrypt: Adding key to character's ASCII value
        char encryptedChar = (char) (inputChar + key);

        // Output: Encrypted character
        System.out.println("Encrypted character: " + encryptedChar);

        scanner.close();
    }
}
