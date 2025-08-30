package class4;

public class App {
    public static void main(String[] args) {

        // 1. Criar um objeto Pessoa e atribuir a variável da classe Médico
        // Medico m1 = new Pessoa("Ana", 25); // ERRO de compilação
        // Isso gera um erro, porque uma Pessoa NÃO é um Médico.
        // Não se pode atribuir um objeto da classe base (Pessoa) para uma variável da classe derivada (Medico).

        // 2. Criar um objeto Medico e atribuir à variável da classe Pessoa
        Pessoa m2 = new Medico("Carlos", 45, "12345-DF", "Cardiologia");

        m2.cumprimentar(); // Chama o método sobrescrito de Medico (polimorfismo)
        ((Pessoa)m2).cumprimentar(); // Também chama o método sobrescrito de Medico (a mesma coisa)

        // m2.atender(); // ERRO de compilação. O método atender() não existe na classe Pessoa.

        ((Medico)m2).atender(); // Funciona por conta do cast explícito para Medico.

        // 3. Atribuir m2 a uma variável da classe Medico
        // Medico m3 = m2; // ERRO de compilação - o compilador não sabe se m2 é um Medico
        Medico m3 = (Medico)m2; // Funciona porque m2 é realmente um Medico

        m3.atender(); // Chama o método da classe Medico

        // 4. Criar um objeto Pessoa e atribuir a uma variável da classe Pessoa
        Pessoa p1 = new Pessoa("Caio", 25);
        p1.cumprimentar(); // Chama o método da própria classe Pessoa

        // ((Medico)p1).cumprimentar(); // ERRO em tempo de execução
        // p1 não é um Medico, então não pode ser convertido.
    }
}
