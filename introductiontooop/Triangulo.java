package introductiontooop;

public class Triangulo {
    private double side1;
    private double side2;
    private double side3;

    public Triangulo(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public boolean formaTriangulo() {
        return (side1 + side2 > side3) &&
               (side1 + side3 > side2) &&
               (side2 + side3 > side1);
    }

    public String obterTipo() {
        if (side1 == side2 && side2 == side3) {
            return "Equilátero";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }

    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(7, 10, 5);

        if (triangulo1.formaTriangulo()) {
            System.out.println("Tipo do triângulo: " + triangulo1.obterTipo());
        } else {
            System.out.println("Triângulo inválido");
        }
    }
}
