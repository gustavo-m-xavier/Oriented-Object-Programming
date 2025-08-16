package exercise1class2;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de provas: ");
        int numProvas = scanner.nextInt();
        double[] notas = new double[numProvas];
        double soma = 0.0;
        for (int i = 0; i < numProvas; i++) {
            System.out.printf("Digite a nota da prova %d: ", i + 1);
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }
        double media = soma / numProvas;
        System.out.printf("A média das notas é: %.2f\n", media);
        
        scanner.close();
    }
}