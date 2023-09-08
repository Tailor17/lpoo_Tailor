package controller;

import model.Produto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProdutoController {
    public static void main(String[] args){
        Produto produto1 = new Produto("Melão",10.0,10);
        System.out.println(produto1);
        System.out.println();

        Produto produto2 = new Produto("Arroz",10.0,50);
        System.out.println(produto2);
        System.out.println();

        Produto produto3 = new Produto("Morango",10.0,100);
        System.out.println(produto3);

        Produto produto4 = new Produto("Batata",2.50, 60);
        System.out.println();
        System.out.println(produto4);

        //Listas

        List<Produto> ArrayList;
        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        System.out.println();
        System.out.println("__________Lista Original_________");
        System.out.println(produtos);

        //Ordenar a Coleção em Ordem alfabetica
        produtos.sort(Comparator.comparing(Produto::getNome));
        System.out.println("__________Lista Ordenada_________");
        System.out.println(produtos);

        //Pesquisa po Força Bruta

        System.out.println();
        System.out.println("Localizando o produto pelo nome Morango(Pela chave usando força bruta)");
        produtos.forEach(p -> {
            if(p.getNome().equals("Morango")){
                System.out.println(p);
            }
        });
        //Pesquisando Usando filter
        System.out.println();
        System.out.println("Localizando o produto pelo nome Morango(Usando o Filter)");
        Produto produtoFind = produtos.stream().filter(p -> p.getNome().equals("Morango")).findAny().orElse(null);
        System.out.println(produtoFind);

    }

}
///
