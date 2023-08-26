package br.com.ebac;

import java.util.Scanner;

public class Disciplina {

    private Double minhaNota;
    private String disciplina;

    public Double getMinhaNota() {
        return minhaNota;
    }

    public void setMinhaNota(Double minhaNota) {
        this.minhaNota = minhaNota;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void inserirMinhaNota(double nota) {
        setMinhaNota(nota);
    }

    public void inserirDisciplina (Scanner nome) {

    }
}
