package assessment2;

import java.text.Normalizer;
import java.util.Scanner;

public class Algorithm4 {

    public static String removeAccents(String input) {
        if (input == null) return null;
        return Normalizer.normalize(input, Normalizer.Form.NFD)
                         .replaceAll("\\p{M}", ""); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva uma frase: ");
        String text = scanner.nextLine();

        text = text.toLowerCase();

        text = text.replaceAll("[^a-z0-9]", "");

        text = removeAccents(text);

        boolean isPalindrome = true;
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("É palíndromo!");
        } else {
            System.out.println("Não é palíndromo!");
        }

        scanner.close();
    }
}
