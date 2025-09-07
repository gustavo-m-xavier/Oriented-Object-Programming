package assessment3;

public class Isosceles extends Triangulo {

    public Isosceles(double ladoIgual, double ladoDiferente) {
        super(ladoIgual, ladoIgual, ladoDiferente);
        if (ladoIgual <= 0 || ladoDiferente <= 0) {
            throw new IllegalArgumentException("Lados do triângulo isósceles devem ser > 0.");
        }
    }
}