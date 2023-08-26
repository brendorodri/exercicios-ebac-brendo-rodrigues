package br.com.ebac;

public class Nota {

    private Double minhaNota;

    public Double getMinhaNota() {
        return minhaNota;
    }

    public void setMinhaNota(Double minhaNota) {
        this.minhaNota = minhaNota;
    }

    public void inserirMinhaNota(double nota) {
        setMinhaNota(nota);
    }

}
