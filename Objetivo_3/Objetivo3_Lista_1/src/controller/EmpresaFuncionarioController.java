package controller;
import model.Empresa;
import model.Funcionario;
import java.time.LocalDate;
import java.util.Comparator;

public class EmpresaFuncionarioController {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario(100L, "22244455566", "Jennifer", "Radunz", LocalDate.of(1999, 3, 11));
        Funcionario f2 = new Funcionario(100L, "12365478954", "Tailor", "Zitzke", LocalDate.of(2002, 4, 20));
        Funcionario f3 = new Funcionario(100L, "12345698778", "Jorge", "Costa", LocalDate.of(2016, 8, 17));
        Funcionario f4 = new Funcionario(100L, "98745612363", "Yasmin", "Zitzke", LocalDate.of(1990, 6, 19));
        Funcionario f5 = new Funcionario(100L, "74568899554", "Fernando", "Andrade", LocalDate.of(1991, 5, 27));
        Funcionario f6 = new Funcionario(100L, "98653212365", "Pedro", "Caetano", LocalDate.of(2002, 10, 29));

        Empresa e1 = new Empresa("27.773.611/0001-54", "SM Eireli", "SulMed");
        Empresa e2 = new Empresa("39.873.882/0001-45", "Ztzke alimentos", "TDY Morangos");

        e1.getFuncionarios().add(f1);
        e1.getFuncionarios().add(f2);
        e1.getFuncionarios().add(f3);

        e2.getFuncionarios().add(f4);
        e2.getFuncionarios().add(f5);
        e2.getFuncionarios().add(f6);

        System.out.print("\n Funcionários da Empresa por Critério de Nome:\n");
        System.out.print("\n" + e1.getNomeFantasia());
        e1.getFuncionarios().sort(Comparator.comparing(Funcionario::getNome));
        System.out.println(e1);
        System.out.print("\n" + e2.getNomeFantasia());
        e2.getFuncionarios().sort(Comparator.comparing(Funcionario::getNome));
        System.out.println(e2);

        System.out.print("\nFuncionários da Empresa por Critério de Idade na Ordem Decrescente:\n");
        System.out.print("\n" + e1.getNomeFantasia());
        e1.getFuncionarios().sort(Comparator.comparing(Funcionario::getDataNascimento).reversed());
        System.out.println(e1);
        System.out.print("\n" + e2.getNomeFantasia());
        e2.getFuncionarios().sort(Comparator.comparing(Funcionario::getDataNascimento).reversed());
        System.out.println(e2);

    }
}