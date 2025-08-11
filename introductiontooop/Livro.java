package introductiontooop;

public class Livro {
    private String title;
    private String author;
    private int year;

    public Livro(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void exibir() {
        System.out.println("Exibindo o Livro:");
        System.out.println("Título: " + this.title);
        System.out.println("Autor: " + this.author);
        System.out.println("Ano: " + this.year);
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro("Coroa da Meia-Noite", "Sarah J. Maas", 2014);
        livro1.exibir();
    }
}
