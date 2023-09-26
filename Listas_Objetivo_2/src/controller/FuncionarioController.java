package controller;

import model.*;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {
    public static void main(String[] args) {
        Desenvolvedor d1 = new Desenvolvedor();
        Desenvolvedor d2 = new Desenvolvedor("Yasmin",2000.0);

        Gerente g1 = new Gerente();
        Gerente g2 = new Gerente("Jenni",1000.00);
        System.out.println("******** Questão 1 ********");
        System.out.print("Funcionário criados:");
        System.out.println(d1 + "" + d2 + "" + g1 + "" + g2);
        System.out.println();
        g1.setNome("Tailor");
        g1.setSalario(3000.00);
        d1.setNome("Luiza");
        d1.setSalario(1500.00);
        System.out.print("Funcionário Sobrescritos:");
        System.out.println(d1 + "" + d2 + "" + g1 + "" + g2);

        System.out.println();
        System.out.println("************Bonus de cada funcionario************");
        System.out.println(d1);
        System.out.println("Bonus = "+ d1.getBonus());
        System.out.println(d2);
        System.out.println("Bonus = "+ d2.getBonus());
        System.out.println(g1);
        System.out.println("Bonus = "+ g1.getBonus());
        System.out.println(g2);
        System.out.println("Bonus = "+ g2.getBonus());
    //Respostas
    //1. Não é possível criar pois a classe Funcionario é abstrata.
    //2. É colocado nas classes de modelo, onde o dominio é modelado.
    //

        GerenteGeral ger1 = new GerenteGeral("Guilherme",6500.00);
        GerenteDesenvolvimento ger2 = new GerenteDesenvolvimento("Jorge",4500.0);
        System.out.println();
        System.out.println(ger1);
        System.out.println(ger2);

        DesenvolvedorSenior dev1 = new DesenvolvedorSenior("Jennifer",3500.0);
        DesenvolvedorSenior dev2 = new DesenvolvedorSenior("Carmen",3500.0);
        DesenvolvedorSenior dev3 = new DesenvolvedorSenior("Fabio",3500.0);
        DesenvolvedorSenior dev4 = new DesenvolvedorSenior("Djulie",3500.0);
        DesenvolvedorSenior dev5 = new DesenvolvedorSenior("Carlos",3500.0);
        DesenvolvedorSenior dev6 = new DesenvolvedorSenior("Lucas",3500.0);

        DesenvolvedorPleno dev7 = new DesenvolvedorPleno("Nicolas",2500.0);
        DesenvolvedorPleno dev8 = new DesenvolvedorPleno("Jorge",2500.0);
        DesenvolvedorPleno dev9 = new DesenvolvedorPleno("Luciane",2500.0);
        DesenvolvedorPleno dev10 = new DesenvolvedorPleno("Tailor",2500.0);
        DesenvolvedorPleno dev11 = new DesenvolvedorPleno("Marcos",2500.0);
        DesenvolvedorPleno dev12 = new DesenvolvedorPleno("Roger",2500.0);

        DesenvolvedorJunior dev13 = new DesenvolvedorJunior("Betina",1800.00);
        DesenvolvedorJunior dev14 = new DesenvolvedorJunior("Sophia",1800.00);
        DesenvolvedorJunior dev15 = new DesenvolvedorJunior("Elisangela",1800.00);
        DesenvolvedorJunior dev16 = new DesenvolvedorJunior("Cassio",1800.00);
        DesenvolvedorJunior dev17 = new DesenvolvedorJunior("Milena",1800.00);
        DesenvolvedorJunior dev18 = new DesenvolvedorJunior("Amanda",1800.00);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(ger1);
        funcionarios.add(ger2);
        funcionarios.add(dev1);
        funcionarios.add(dev2);
        funcionarios.add(dev3);
        funcionarios.add(dev4);
        funcionarios.add(dev5);
        funcionarios.add(dev6);
        funcionarios.add(dev7);
        funcionarios.add(dev8);
        funcionarios.add(dev9);
        funcionarios.add(dev10);
        funcionarios.add(dev11);
        funcionarios.add(dev12);
        funcionarios.add(dev13);
        funcionarios.add(dev14);
        funcionarios.add(dev15);
        funcionarios.add(dev16);
        funcionarios.add(dev17);
        funcionarios.add(dev18);

        System.out.println("Funcionarios cadastrados na empresa: "+funcionarios);

        double total_folha_com_bonus = 0.0;
        for (Funcionario funcionario : funcionarios) {
            total_folha_com_bonus += funcionario.getSalario() + funcionario.getBonus();
        }

        System.out.println("\n\n******* Total da Folha COM Bônus *******");
        System.out.println(NumberFormat.getCurrencyInstance().format(total_folha_com_bonus));
        System.out.println(
                NumberFormat.getCurrencyInstance().format(
                        funcionarios.stream()
                                .mapToDouble(f -> f.getSalario() + f.getBonus())
                                .sum()));

        // Cáculo do valor do bônus e do salário bruto de cada funcionário.
        System.out.print("\n\n******* Salário bruto, bônus e salário de cada funcionário *******");
        funcionarios.forEach(f -> {
            double salarioBruto = f.getSalario() + f.getBonus();
            System.out.println("\nFuncionário: " + f.getNome());
            System.out.println("Cargo: " + f.getClass().getSimpleName());
            System.out.println("Salário= " + NumberFormat.getCurrencyInstance().format(f.getSalario()));
            System.out.println("Bônus= " + NumberFormat.getCurrencyInstance().format(f.getBonus()));
            System.out.println("Salário bruto= " + NumberFormat.getCurrencyInstance().format(salarioBruto));

        });

        // Cálculo do salário com o reajuste de 5%.
        total_folha_com_bonus = 0.0;
        for(Funcionario f : funcionarios){
            f.setSalario(f.getSalario() + (f.getSalario() * 0.05));
            total_folha_com_bonus += f.getSalario() + f.getBonus();
        }
        System.out.println("\n\n******* Total da Nova Folha COM Reajuste *******");
        System.out.println("Cálculo com acumulador e forEach (Programação imperativa)");
        System.out.println(NumberFormat.getCurrencyInstance().format(total_folha_com_bonus));
        System.out.println("Cálculo com programação funcional (Streams do Projeto Lambda do Java)");
        System.out.println(
                NumberFormat.getCurrencyInstance().format(
                        funcionarios.stream()
                                .mapToDouble(f -> {
                                    f.setSalario(f.getSalario() + (f.getSalario() * 0.05));
                                    return f.getSalario() + f.getBonus();
                                }).sum()
                )
        );
    }

}