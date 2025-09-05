package assessment3;

public class Retangulo extends Forma2d {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        super(base == altura ? "Quadrado" : "Retângulo"); // Requisito 3.2

        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Base e altura devem ser > 0.");
        }

        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura; 
    }

    @Override
    public double perimetro() {
        return 2 * (base + altura);
    }

    @Override
    public void descricao(String nome, double area, double perimetro) {
        System.out.printf("Figura: %s%n", nome);
        System.out.printf("Base: %.2f%n", base);
        System.out.printf("Altura: %.2f%n", altura);
        System.out.printf("Área: %.2f%n", area);
        System.out.printf("Perímetro: %.2f%n", perimetro);
    }
}