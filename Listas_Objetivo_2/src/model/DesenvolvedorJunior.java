package model;

import java.text.NumberFormat;

public class DesenvolvedorJunior extends Desenvolvedor{
    public DesenvolvedorJunior(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return super.getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedor Junior [Bonus= "
                + NumberFormat.getCurrencyInstance().format(getBonus())
                + ", Nome= " + getNome()
                + ", Salario= "
                + NumberFormat.getCurrencyInstance().format(getSalario()) + "]";
    }
}
