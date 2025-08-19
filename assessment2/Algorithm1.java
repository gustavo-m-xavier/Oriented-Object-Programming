package assessment2;

import java.util.Scanner;

public class Algorithm1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String line = scanner.nextLine();
        String[] parts = line.split("\t");

        int n = Integer.parseInt(parts[0]);
        double k = Double.parseDouble(parts[1]);
        String name = parts[2];

        System.out.println("Número inteiro: " + n);
        System.out.println("Número de ponto flutuante: " + k);
        System.out.println("Nome: " + name);
        
        scanner.close();
    }
}