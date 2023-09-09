package model;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor() {
        super();
    }

    public Desenvolvedor(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
       return super.getSalario();
    }

    @Override
    public String toString() {
        return "\nDesenvolvedor { Nome = "+super.getNome()+" Salário = "+super.getSalario()+"}";
    }
}
