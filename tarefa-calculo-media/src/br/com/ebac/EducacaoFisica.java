package br.com.ebac;

public class EducacaoFisica {
    private double nota;

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void inserirNota(double nota) {
        setNota(nota);
    }
}
