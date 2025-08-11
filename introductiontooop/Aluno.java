package introductiontooop;

public class Aluno 
{
    public String name;
    public double age;
    public String course;

    public void apresentar() {
        System.out.println("Dados do aluno:");
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.age);
        System.out.println("Curso: " + this.course);
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.name = "Gustavo";
        aluno1.age = 19;
        aluno1.course = "Ciência da Computação";

        aluno1.apresentar();
    }
}
