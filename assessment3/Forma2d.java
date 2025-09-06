package assessment3;

public class Forma2d {
    private String nome;

    public Forma2d(String nome) {
        if (nome == null || nome.equals("")) {
            throw new IllegalArgumentException("Nome não deve ser vazio.");
        }
        this.nome = nome;
    }

    public String obterNome() {
        return this.nome;
    }

    public void descricao() {
        System.out.println("Figura: " + nome);
        System.out.println("Área: " + area());
        System.out.println("Perímetro: " + perimetro());
    }

    public double area() {
        return 0.0;
    }

    public double perimetro() {
        return 0.0;
    }
}
