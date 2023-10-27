package model;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Corrida {

    private long id;

    private String tipoPagamento;

    private String detalhesPagamento;

    private LocalDateTime dataInicio;

    private double preco;

    private Motorista motorista;

    private Usuario usuario;

    public Corrida() {
    }

    public Corrida(long id, String tipoPagamento, String detalhesPagamento, LocalDateTime dataInicio, double preco, Motorista motorista, Usuario usuario) {
        this.id = id;
        this.tipoPagamento = tipoPagamento;
        this.detalhesPagamento = detalhesPagamento;
        this.dataInicio = dataInicio;
        this.preco = preco;
        this.motorista = motorista;
        this.usuario = usuario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getDetalhesPagamento() {
        return detalhesPagamento;
    }

    public void setDetalhesPagamento(String detalhesPagamento) {
        this.detalhesPagamento = detalhesPagamento;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "\nCorrida{" +
                "id=" + id +
                ", tipoPagamento='" + tipoPagamento + '\'' +
                ", detalhesPagamento='" + detalhesPagamento + '\'' +
                ", dataInicio=" + dataInicio +
                ", preco=" + preco +
                ", motorista=" + motorista +
                ", usuario=" + usuario +
                '}';
    }
}