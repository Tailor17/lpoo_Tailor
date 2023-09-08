package model;

public abstract class Conta {
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }
    public void  deposita(double valor){
        this.saldo  += valor;
    }
    public void  saca(double valor){
        double saldoAtual = this.saldo-valor;
        if(saldoAtual > 0){
        this.saldo  -= valor;
        }else{
            System.out.println("Não foi possivel realizar o saque");
        }
    }
    public void  atualiza(double taxa){
        if(taxa > 0){
        this.saldo  += this.saldo * (taxa/100);
        }else {
            System.out.println("A taxa deve ser maior que zero");
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "Saldo = " + saldo +
                '}';
    }
}


