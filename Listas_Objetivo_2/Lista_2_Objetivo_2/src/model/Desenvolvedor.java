package model;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor() {
        super();
    }

    public Desenvolvedor(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public Double getBonus() {
        return this.getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedor{" +
                "nome=" + getNome() +
                ", salario=" + getSalario() +
                ", bonus=" + getBonus() +
                '}';
    }
}