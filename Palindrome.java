import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a phrase to determine whether it's a palindrome phrase or not: ");
        String userPhrase = input.nextLine();
        String userPhraseLowerCase = userPhrase.replaceAll("[, . ! ? ' + - * ()]", "").toLowerCase();
        String palindromePhrase = "";
        for (int i = userPhraseLowerCase.length(); i > 0; i--) {
            palindromePhrase = palindromePhrase + userPhraseLowerCase.charAt(i - 1);

        }
        System.out.println(palindromePhrase);
        if (userPhraseLowerCase.equals(palindromePhrase)) {
            System.out.println("\nThe phrase is a palindrome");

        } else
            System.out.println("\nThe phrase isn't a palindrome");

    }
}
