package model;

import java.text.NumberFormat;

public class GerenteGeral extends Gerente{

    public GerenteGeral(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return super.getSalario()*0.40;
    }

    @Override
    public String toString() {
        return "\nGerente Geral [Bonus= "
                + NumberFormat.getCurrencyInstance().format(getBonus())
                + ", Nome= " + getNome()
                + ", Salario= "
                + NumberFormat.getCurrencyInstance().format(getSalario()) + "]";
    }
}
