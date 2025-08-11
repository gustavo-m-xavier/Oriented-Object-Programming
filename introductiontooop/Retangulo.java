package introductiontooop;

public class Retangulo {
    private double width;
    private double height;

    public Retangulo(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getwidth() {
        return width;
    }

    public double getheight() {
        return height;
    }

    public void setwidth(double width) {
        this.width = width;
    }

    public void setheight(double height) {
        this.height = height;
    }

    public double calcularArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo(5.0, 3.0);

        System.out.println("Área do retângulo: " + retangulo1.calcularArea());
    }
}
