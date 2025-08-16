package exercise1class2;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Digite seu nome: ");
       String name = scanner.nextLine();
       System.out.printf("Digite sua idade: ");
        int age = scanner.nextInt();
        System.out.printf("Olá, %s! Você tem %d anos.\n", name, age);
       scanner.close();
   }
}