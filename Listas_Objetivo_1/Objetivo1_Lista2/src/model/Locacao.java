package model;



import java.util.Calendar;

public class Locacao {
    private Integer id;
    private Calendar dataLocacao;
    private Calendar horadevolucao;
    private Calendar dataDevolucao;
    private Calendar horalocacao;
    private Integer quilometragem;
    private double valorCalcao;
    private double valorLocacao;
    private Boolean devolvido;

    public Locacao() {
    }

    public Locacao(Integer id, Calendar dataLocacao, Calendar horadevolucao, Calendar dataDevolucao,
                   Calendar horalocacao, Integer quilometragem,
                   double valorCalcao, double valorLocacao, Boolean devolvido) {
        this.id = id;
        this.dataLocacao = dataLocacao;
        this.horadevolucao = horadevolucao;
        this.dataDevolucao = dataDevolucao;
        this.horalocacao = horalocacao;
        this.quilometragem = quilometragem;
        this.valorCalcao = valorCalcao;
        this.valorLocacao = valorLocacao;
        this.devolvido = devolvido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Calendar dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Calendar getHoradevolucao() {
        return horadevolucao;
    }

    public void setHoradevolucao(Calendar horadevolucao) {
        this.horadevolucao = horadevolucao;
    }

    public Calendar getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Calendar dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Calendar getHoralocacao() {
        return horalocacao;
    }

    public void setHoralocacao(Calendar horalocacao) {
        this.horalocacao = horalocacao;
    }

    public Integer getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(Integer quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getValorCalcao() {
        return valorCalcao;
    }

    public void setValorCalcao(double valorCalcao) {
        this.valorCalcao = valorCalcao;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public Boolean getDevolvido() {
        return devolvido;
    }

    public void setDevolvido(Boolean devolvido) {
        this.devolvido = devolvido;
    }

    @Override
    public String toString() {
        return "\nLocacao{" +
                "id=" + id +
                ", dataLocacao=" + dataLocacao +
                ", horadevolucao=" + horadevolucao +
                ", dataDevolucao=" + dataDevolucao +
                ", horalocacao=" + horalocacao +
                ", quilometragem=" + quilometragem +
                ", valorCalcao=" + valorCalcao +
                ", valorLocacao=" + valorLocacao +
                ", devolvido=" + devolvido +
                '}';
    }
}

