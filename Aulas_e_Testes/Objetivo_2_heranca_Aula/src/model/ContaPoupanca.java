package model;

public class ContaPoupanca extends Conta{
    public void  saca(double valor){
        if(this.saldo >= valor){
            this.saldo  -= valor;
        }
        else {
            System.out.println("Saldo insuficiente");
        }


}}

