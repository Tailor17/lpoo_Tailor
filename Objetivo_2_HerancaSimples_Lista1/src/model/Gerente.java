package model;

public class Gerente extends Funcionario{

    @Override
    public double getBonus() {
        return this.salario * 0.05;
    }
}
