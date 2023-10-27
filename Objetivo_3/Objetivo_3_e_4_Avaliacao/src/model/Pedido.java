package model;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int numero;

    private LocalDateTime date;

    private double valorTotalItem;

    private double valorTotalPedido;

    private Tipo tipo;

    private Vendedor vendedor;

    private List<Item> itens = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(int numero, LocalDateTime date, double valorTotalItem, double valorTotalPedido, Tipo tipo, Vendedor vendedor) {
        this.numero = numero;
        this.date = date;
        this.valorTotalItem = valorTotalItem;
        this.valorTotalPedido = valorTotalPedido;
        this.tipo = tipo;
        this.vendedor = vendedor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public double getValorTotalItem() {
        return valorTotalItem;
    }

    public void setValorTotalItem(double valorTotalItem) {
        this.valorTotalItem = valorTotalItem;
    }

    public double getValorTotalPedido() {
        return valorTotalPedido;
    }

    public void setValorTotalPedido(double valorTotalPedido) {
        this.valorTotalPedido = valorTotalPedido;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "\nPedido{" +
                "numero=" + numero +
                ", date=" + date +
                ", valorTotalItem=" + valorTotalItem +
                ", valorTotalPedido=" + valorTotalPedido +
                ", tipo=" + tipo +
                ", vendedor=" + vendedor +
                ", itens=" + itens +
                '}';
    }
}