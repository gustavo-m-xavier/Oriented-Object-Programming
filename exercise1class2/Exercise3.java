package exercise1class2;

public class Exercise3 {
    public static void main(String[] args) {
       int vet[] = new int[5];
       Scanner scanner = new Scanner(System.in);
       System.out.println("Leitura do vetor:");
       for(int i = 0; i < 5; i++) {
           System.out.printf("vet[%d]: ", i);
           vet[i] = scanner.nextInt();
       }
       System.out.println("Exibir vetor:");
       for(int i = 0; i < 5; i++) {
           System.out.printf("vet[%d]: %d\n", i, vet[i]);
       }
       scanner.close();
       
   }
}