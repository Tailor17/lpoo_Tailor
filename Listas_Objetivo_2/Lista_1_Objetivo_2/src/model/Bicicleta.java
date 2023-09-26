package model;

public class Bicicleta extends Veiculo {

    private int tamanhoRoda;

    private String chassi;

    public Bicicleta(int tamanhoRoda, String chassi) {
        this.tamanhoRoda = tamanhoRoda;
        this.chassi = chassi;
    }

    public Bicicleta(int numeroDeEixos, String propulsao, String marca,
                     String modelo, int anoFabricacao, int tamanhoRoda, String chassi) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.tamanhoRoda = tamanhoRoda;
        this.chassi = chassi;
    }

    public int getTamanhoRoda() {
        return tamanhoRoda;
    }

    public void setTamanhoRoda(int tamanhoRoda) {
        this.tamanhoRoda = tamanhoRoda;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    @Override
    public String toString() {
        return "\nBicicleta{" +
                "tamanhoRoda=" + tamanhoRoda +
                ", chassi=" + chassi  +
                ", numeroDeEixos=" + getNumeroDeEixos() +
                ", propulsao=" + getPropulsao()  +
                ", marca=" + getMarca() +
                ", modelo=" + getModelo() +
                ", anoFabricacao=" + getAnoFabricacao() +
                '}';
    }
}