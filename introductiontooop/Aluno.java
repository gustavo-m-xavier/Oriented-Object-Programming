package introductiontooop;

public class Aluno {
    private String name;
    private double age;
    private String course;

    public Aluno(String name, double age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void apresentar() {
        System.out.println("Dados do aluno:");
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.age);
        System.out.println("Curso: " + this.course);
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Gustavo", 19, "Ciência da Computação");
        aluno1.apresentar();
    }
}
