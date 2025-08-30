package class4;

public class Medico extends Pessoa {

    private String crm;
    private String especialidade;

    public Medico(String nome, int idade, String crm, String especialidade) {
        super(nome, idade);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    @Override
    public void cumprimentar() {
        System.out.println("Olá, sou o Dr. " + super.nome + 
            " e minha especialidade é " + this.especialidade + ".");
    }

    public void atender() {
        System.out.println("Atendendo paciente...");
    }
}
