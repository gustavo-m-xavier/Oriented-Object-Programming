package assessment2;

import java.util.Scanner;

public class Algorithm2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um texto: ");
        String text = scanner.nextLine();

        int lastVogal = -1;

        for(int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                lastVogal = i;
            }
        }

        if(lastVogal != -1) {
            System.out.println("Última vogal encontrada na posição: " + lastVogal);
        } else {
            System.out.println("Vogal não encontrada!");
        }
        
        scanner.close();
    }
}