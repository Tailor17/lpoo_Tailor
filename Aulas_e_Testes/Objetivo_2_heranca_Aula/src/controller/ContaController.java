package controller;

import model.ContaConjunta;
import model.ContaCorrente;
import model.ContaPoupanca;
import model.ContaPoupancaSalario;

public class ContaController {


    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente();
        ContaPoupanca cp1 = new ContaPoupanca();
        ContaConjunta cj1 = new ContaConjunta();
        ContaPoupancaSalario cps1 = new ContaPoupancaSalario();

        cc1.deposita(1000);
        System.out.println("Conta Corrente");
        System.out.println(cc1);
        cc1.saca(1100);
        System.out.println(cc1);

        System.out.println();
        cp1.deposita(2000);
        System.out.println("Conta Poupança");
        System.out.println(cp1);
        System.out.println();

        cj1.deposita(5000);
        System.out.println("Conta Conjunta");
        System.out.println(cj1);
        System.out.println();

        cps1.deposita(7000);
        System.out.println("Conta Poupança Salario");
        System.out.println(cps1);
    }}
