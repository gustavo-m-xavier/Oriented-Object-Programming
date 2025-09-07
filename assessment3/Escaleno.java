package assessment3;

public class Escaleno extends Triangulo {

    public Escaleno(double ladoA, double ladoB, double ladoC) {
        super(ladoA, ladoB, ladoC);
        if (ladoA <= 0 || ladoB <= 0 || ladoC <= 0) {
            throw new IllegalArgumentException("Lados do triângulo escaleno devem ser > 0.");
        }
        if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            throw new IllegalArgumentException("Lados do triângulo escaleno devem ser diferentes.");
        }
    }
}