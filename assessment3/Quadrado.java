package assessment3;

public class Quadrado extends Retangulo {

    public Quadrado(double lado) {
        super(lado, lado);
        if (lado <= 0) {
            throw new IllegalArgumentException("Lado do quadrado deve ser > 0.");
        }
    }
}
