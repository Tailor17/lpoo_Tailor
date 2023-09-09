package model;

public class Gerente extends Funcionario{

    public Gerente() {
        super();
    }

    public Gerente(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return super.getSalario();
    }

    @Override
    public String toString() {
        return "\nGerente{ Nome = "+ super.getNome()+"  Salário = "+super.getSalario()+ "}";
    }
}
