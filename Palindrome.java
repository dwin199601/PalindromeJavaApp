import java.util.Scanner;

import javax.swing.JOptionPane;

public class Palindrome {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Welcome to the palindrome app!");

        String userPhrase = JOptionPane.showInputDialog(null,
                "Enter a phrase to determine whether it's a palindrome phrase or not: ");
        String userPhraseLowerCase = userPhrase.replaceAll("[, . ! ? ' + - * ()]", "").toLowerCase();
        String palindromePhrase = "";
        for (int i = userPhraseLowerCase.length(); i > 0; i--) {
            palindromePhrase = palindromePhrase + userPhraseLowerCase.charAt(i - 1);

        }
        System.out.println(palindromePhrase);
        if (userPhraseLowerCase.equals(palindromePhrase)) {

            JOptionPane.showMessageDialog(null, "The phrase is a palindrome!");

        } else

            JOptionPane.showMessageDialog(null, "The phrase isn't a palindrome!");

    }
}
