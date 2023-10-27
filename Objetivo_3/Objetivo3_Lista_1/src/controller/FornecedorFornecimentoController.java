package controller;
import model.Fornecedor;
import model.Fornecimento;
import model.Produto;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FornecedorFornecimentoController {
    public static void main(String[] args) {

        Fornecedor f1 = new Fornecedor("75.433.223/0001-50", "Joana 53959485858", "Mercado Joia");
        Fornecedor f2 = new Fornecedor("83.987.209/0001-63", "Leandro 21985649885", "PneusFormula");

        Produto p1 = new Produto(111, "Cardioversor", 35, 20500.00,f2);
        Produto p2 = new Produto(222, "Morango", 25, 18.00, f1);
        Produto p3 = new Produto(333, "Banana", 155, 4.55,f1);

        Fornecimento forn1 = new Fornecimento(LocalDateTime.of(2023, 11, 14, 16, 25), p1.getPreco()*p1.getQuantidade(),p1,f2);
        Fornecimento forn2 = new Fornecimento(LocalDateTime.of(2022, 10, 26, 17, 26), p1.getPreco()*p1.getQuantidade(),p2,f1);
        Fornecimento forn3 = new Fornecimento(LocalDateTime.of(2021, 12, 31, 18, 27), p1.getPreco()*p1.getQuantidade(),p3,f1);

        List<Fornecimento> FornecimentoList = new ArrayList<>();
        FornecimentoList.add(forn1);
        FornecimentoList.add(forn2);
        FornecimentoList.add(forn3);
        System.out.println("\nLista de Fornecimentos:\n");
        System.out.println(FornecimentoList);

        int totalforn = 0;
        for (Fornecimento forn : FornecimentoList ) {
            totalforn += forn.getProduto().getQuantidade();
        }
        System.out.println("\nTotal Fornecido = " + totalforn + " Unidades");

    }
}