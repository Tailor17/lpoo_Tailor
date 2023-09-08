package model;

public class Desenvolvedor extends Funcionario{

    @Override
    public double getBonus() {
        return this.salario * 0.02;
    }
}
}
