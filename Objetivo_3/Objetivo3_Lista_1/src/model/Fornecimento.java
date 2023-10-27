package model;

import java.time.LocalDateTime;

public class Fornecimento {

    private LocalDateTime data;

    private double valorTotal;

    private Produto produto;

    private Fornecedor fornecedor;

    public Fornecimento() {
    }

    public Fornecimento(LocalDateTime data, double valorTotal, Produto produto, Fornecedor fornecedor) {
        this.data = data;
        this.valorTotal = valorTotal;
        this.produto = produto;
        this.fornecedor = fornecedor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "\nFornecimento{" +
                "data=" + data +
                ", valorTotal=" + valorTotal +
                ", produto=" + produto +
                ", fornecedor=" + fornecedor +
                '}';
    }
}