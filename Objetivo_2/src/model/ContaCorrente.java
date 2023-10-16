package model;

public class ContaCorrente extends Conta implements Associado {

    private int qdeCotas;

    private double valorCota;

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo, int qdeCotas, double valorCota) {
        super(saldo);
        this.qdeCotas = qdeCotas;
        this.valorCota = valorCota;
    }

    public int getQdeCotas() {
        return qdeCotas;
    }

    public void setQdeCotas(int qdeCotas) {
        this.qdeCotas = qdeCotas;
    }

    public double getValorCota() {
        return valorCota;
    }

    public void setValorCota(double valorCota) {
        this.valorCota = valorCota;
    }

    @Override
    public double lucros(int qdeCotas, double valorCota) {
        this.qdeCotas = qdeCotas;
        this.valorCota = valorCota;
        return valorCota;
    }

    @Override
    public int getQtdeCotas() {
        return qdeCotas;
    }

    @Override
    public String toString() {
        return "\nContaCorrente{" +
                "qdeCotas=" + qdeCotas +
                ", valorCota=" + valorCota +
                ", saldo=" + saldo +
                '}';
    }
}