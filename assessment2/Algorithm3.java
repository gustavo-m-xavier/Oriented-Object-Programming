package assessment2;

import java.util.Scanner;

public class Algorithm3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um texto: ");
        String text = scanner.nextLine();

        char[] charArray = text.toCharArray();

        int i = 0;
        int j = charArray.length - 1;

        while (i < j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;

            i++;
            j--;
        }

        String reversed = String.valueOf(charArray);

        System.out.println("String invertida: " + reversed);
        
        scanner.close();
    }
}