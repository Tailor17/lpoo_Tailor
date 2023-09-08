package model;
public class ContaCorrente extends Conta{
    public void saca(double valor){
        double saldoAtual = this.saldo-valor;
        if(saldoAtual >= -200){
            this.saldo  -= valor;
        }else{
            System.out.println("Não foi possivel realizar o saque");
        }

    }
}
