package br.com.ebac;

public class Disciplina {
    private String nome;

    private int nota;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void inserirNomeDisciplina(String disciplina) {
        setNome(disciplina);
    }

    public void inserirNotaAluno (int nota) {
        setNota(nota);
    }
}
