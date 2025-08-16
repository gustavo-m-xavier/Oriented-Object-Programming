package exercise1class2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();
        System.out.print("Digite a ação (soma, subtracao, multiplicacao, divisao): ");
        String action = sc.next();
        int result = 0;
        switch (action) {
            case "soma":
                result = num1 + num2;
                break;
            case "subtracao":
                result = num1 - num2;
                break;
            case "multiplicacao":
                result = num1 * num2;
                break;
            case "divisao":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Divisão por zero não é permitida.");
                    sc.close();
                    return;
                }
                break;
            default:
                System.out.println("Ação inválida.");
                sc.close();
                return;
        }
        System.out.printf("O resultado da %s entre %d e %d é: %d\n", action, num1, num2, result);
        sc.close();
    }
}