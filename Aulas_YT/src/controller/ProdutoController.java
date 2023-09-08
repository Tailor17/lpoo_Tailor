package controller;

public class ProdutoController {
    public static void main(String[] args){
        Produto produto1 = new Produto();
        System.out.println(produto1.nome);
        System.out.println(produto1.valor);
        System.out.println(produto1.estoque);
        System.out.println();

        Produto produto2 = new Produto();
        System.out.println(produto2.nome);
        System.out.println(produto2.valor);
        System.out.println(produto2.estoque);
    }

}
class Produto{
    String nome;
    double valor;
    int estoque;
}
