package controller;

import model.Produto;

public class ProdutoController {
    public static void main(String[] args){
        Produto produto1 = new Produto("Melão",10.0,10);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.getEstoque());
        System.out.println();

        Produto produto2 = new Produto("Arroz",10.0,50);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.getEstoque());
        System.out.println();

        Produto produto3 = new Produto("Morango",10.0,100);
        System.out.println(produto3.getNome());
        System.out.println(produto3.getValor());
        System.out.println(produto3.getEstoque());
    }

}

