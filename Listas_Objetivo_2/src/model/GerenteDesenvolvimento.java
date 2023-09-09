package model;

import java.text.NumberFormat;

public class GerenteDesenvolvimento extends Gerente{

    public GerenteDesenvolvimento(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return super.getSalario()*0.20;
    }

    @Override
    public String toString() {
        return "\nGerente de Desenvolvimento [Bonus= "
                + NumberFormat.getCurrencyInstance().format(getBonus())
                + ", Nome= " + getNome()
                + ", Salario= "
                + NumberFormat.getCurrencyInstance().format(getSalario()) + "]";
    }
}
