package assessment3;

public class Circulo extends Forma2d {
    private double raio;

    public Circulo(double raio) {
        super("Círculo"); 
        if (raio <= 0) {
            throw new IllegalArgumentException("Raio deve ser > 0.");
        }
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public void descricao() {
        System.out.printf("Figura: %s%n", obterNome());
        System.out.printf("Raio: %.2f%n", raio);
        System.out.printf("Área: %.2f%n", area());
        System.out.printf("Perímetro: %.2f%n", perimetro());
    }
}
