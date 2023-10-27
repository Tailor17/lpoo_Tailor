package controller;
import model.Aluno;
import model.Disciplina;
import java.util.Comparator;

public class AlunoDisciplinaController {
    public static void main(String[] args) {

        Aluno a1 = new Aluno(2300L, "Erik", "Cardoso");
        Aluno a2 = new Aluno(2100L, "Fabio", "Zitzke");

        Disciplina d1 = new Disciplina(123L, "Estrutura de Dados");
        Disciplina d2 = new Disciplina(456L, "Linguagem de Programação Orientada a Objetos");
        Disciplina d3 = new Disciplina(789L, "Banco de Dados 1");

        a1.getDisciplinas().add(d1);
        a1.getDisciplinas().add(d2);
        a2.getDisciplinas().add(d1);
        a2.getDisciplinas().add(d2);
        a2.getDisciplinas().add(d3);

        System.out.print("\nDisciplinas por Aluno:\n");
        a1.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(a1);
        a2.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(a2);

        a2.getDisciplinas().clear();
        System.out.print("\nDisciplinas por Aluno com Aluno_2 sem Matrícula em Disciplinas:\n");
        a1.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(a1);
        a2.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(a2);

    }
}