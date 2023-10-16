package controller;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BancoController {
    public static void main(String[] args) {

        //Item A:
        ContaCorrente cc1 = new ContaCorrente(3000.00, 400, 65.00);
        ContaCorrente cc2 = new ContaCorrente(18000.00, 1500, 47.70);
        ContaCorrente cc3 = new ContaCorrente(9950.00, 9000, 27.00);

        ContaPoupanca cp1 = new ContaPoupanca(6000.00);
        ContaPoupanca cp2 = new ContaPoupanca(30000.00);
        ContaPoupanca cp3 = new ContaPoupanca(14550.70);

        Cliente c1 = new Cliente("Tailor", 650, 65.50);
        Cliente c2 = new Cliente("Jennifer", 200, 29.00);
        Cliente c3 = new Cliente("Guilherme", 1500, 60.50);

        System.out.println(cc1);
        System.out.println(cc2);
        System.out.println(cc3);
        System.out.println(cp1);
        System.out.println(cp2);
        System.out.println(cp3);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        //Item B:
        List<Conta> ContaList = new ArrayList<>();
        ContaList.add(cc1);
        ContaList.add(cc2);
        ContaList.add(cc3);
        ContaList.add(cp1);
        ContaList.add(cp2);
        ContaList.add(cp3);

        List<Associado> AssociadoList = new ArrayList<>();
        AssociadoList.add(cc1);
        AssociadoList.add(cc2);
        AssociadoList.add(cc3);
        AssociadoList.add(c1);
        AssociadoList.add(c2);
        AssociadoList.add(c3);

        System.out.print("\nLista de contas bancárias:\n");
        System.out.println(ContaList);

        System.out.print("\nLista de associados no banco:\n");
        System.out.println(AssociadoList);

        //Item C:
        cp1.deposita(1000.00);
        cp1.atualiza(5);
        cp1.saca(50.00);

        //Item D:
        cc1.deposita(500.00);
        cc1.saca(400.00);

        //Item E:
        cc1.setQdeCotas(100);
        cc2.setQdeCotas(400);
        cc3.setQdeCotas(600);
        c1.setQdeCotas(300);
        c2.setQdeCotas(600);
        c3.setQdeCotas(600);

        System.out.println(AssociadoList);

        //Item F:
        AssociadoList.sort(Comparator.comparing(Associado::getQtdeCotas).reversed());
        System.out.print("\nLista de associados em ordem decrescente de cotas:\n");
        System.out.println(AssociadoList);

        Associado associado_maior_cota = Collections.max(AssociadoList, Comparator.comparing(Associado::getQtdeCotas));
        System.out.print("\nLista de associados com o maior número de cotas:\n");
        for (Associado assoc: AssociadoList) {
            if (assoc.getQtdeCotas() >= associado_maior_cota.getQtdeCotas()) {
                System.out.println(assoc);
            }
        }

        //Item G:
        ContaList.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.print("\nLista de contas em ordem decrescente de saldos:\n");
        System.out.println(ContaList);

        System.out.print("\nLista de associados que possuem conta cadastrada:\n");
        for (Associado associado: AssociadoList) {
            if (associado instanceof ContaCorrente) {
                System.out.println(associado);
            }
        }

        Conta conta_maior_saldo = Collections.max(ContaList, Comparator.comparing(Conta::getSaldo));
        System.out.print("\nLista de contas com o maior saldo:\n");
        for (Conta conta: ContaList) {
            if (conta.getSaldo() >= conta_maior_saldo.getSaldo()) {
                System.out.println(conta);
            }
        }
    }
}