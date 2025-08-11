package introductiontooop;

public class Livro
{
    public String title;
    public String author;
    public int year;

    public static void main(String[] args)
    {
        Livro livro1 = new Livro();
        livro1.title = "Coroa da Meia-Noite";
        livro1.author = "Sarah J. Maas";
        livro1.year = 2014;

        livro1.exibir();
    }

    public void exibir()
    {
        System.out.println("Exibindo o Livro: ");
        System.out.println("Título: " + this.title);
        System.out.println("Autor: " + this.author);
        System.out.println("Ano: " + this.year);
    }
}