/*Q1) As a secret agent, you need to send and receive classified messages securely. You've received a message "HELLO" from Agent Y that needs encryption. Using your Java program with a key of 3, you encrypt the message to "KHOOR." This secure encryption ensures your communications are safe from prying eyes during transmission. Agent Y can decrypt it with the same key on the other end. 
 Your program should provide the following functionality: 
 Accept an input string message from the user. 
Accept an encryption key (an integer) from the user. 
Encrypt the message by shifting each character in the message by the key positions. 
Output the encrypted message.*/

import java.util.Scanner;

class CodeingChallenge1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the message to encrypt:");
        String message = sc.nextLine();
        System.out.println("Enter the encryption key (an integer):");
        int key = sc.nextInt();
        String encryptedMessage = encryptedMessage(message, key);
        System.out.println("Encrypted Message: " + encryptedMessage);
        sc.close();
    }

    public static String encryptedMessage(String message, int key) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                char encryptedChar = (char) (base + (c - base + key) % 26);
                encrypted.append(encryptedChar);
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }
}