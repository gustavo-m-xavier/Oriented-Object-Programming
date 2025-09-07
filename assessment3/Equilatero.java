package assessment3;

public class Equilatero extends Triangulo {

    public Equilatero(double lado) {
        super(lado, lado, lado);
        if (lado <= 0) {
            throw new IllegalArgumentException("Lado do triângulo equilátero deve ser > 0.");
        }
    }
}