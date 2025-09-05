package assessment3;

public class Triangulo extends Forma2d {
    private double lado1, lado2, lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        super(classificarTriangulo(lado1, lado2, lado3));

        if (!formaTrianguloValido(lado1, lado2, lado3)) throw new IllegalArgumentException("Os três lados informados não formam um triângulo. Para formar um triângulo, a cada dois lados somados, deverá ser maior que o terceiro.");

        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    private static boolean formaTrianguloValido(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    private static String classificarTriangulo(double a, double b, double c) {
        if (a == b && b == c) {
            return "Triângulo Equilátero";
        } else if (a == b || a == c || b == c) {
            return "Triângulo Isósceles";
        } else {
            return "Triângulo Escaleno";
        }
    }

    @Override
    public double perimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public double area() {
        double s = perimetro() / 2.0;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public void descricao(String nome, double area, double perimetro) {
        System.out.printf("Figura: %s%n", nome);
        System.out.printf("Lado 1: %.2f%n", lado1);
        System.out.printf("Lado 2: %.2f%n", lado2);
        System.out.printf("Lado 3: %.2f%n", lado3);
        System.out.printf("Área: %.2f%n", area);
        System.out.printf("Perímetro: %.2f%n", perimetro);
    }
}
