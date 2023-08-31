package controller;

import model.*;

public abstract class ContaController {
    public static void main(String[] args){
        Conta c1 = new Conta();
        System.out.println(c1);

        ContaCorrente cc1 = new ContaCorrente();
        System.out.println(cc1.getSaldo());
        cc1.deposita(1000.0);
        cc1.saca(2000);
        System.out.println();

        ContaPoupanca cp1 = new ContaPoupanca();
        System.out.println(cp1.getSaldo());
        cp1.deposita(1000.0);
        System.out.println(cp1.getSaldo());
        cp1.saca(500);
        System.out.println(cp1.getSaldo());

        ContaConjunta ccj1 = new ContaConjunta();
        System.out.println(ccj1.getSaldo());
        ccj1.deposita(1000.0);

        ContaPoupancaSalario cps1 = new ContaPoupancaSalario();
        System.out.println(cps1.getSaldo());
        cps1.deposita(1000.0);

    }
}
