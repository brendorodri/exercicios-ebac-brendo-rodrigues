package br.com.ebac;

public class Professor {
    private String nome;

    private String turma;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public void inserirNomeProfessor (String nome) {
        setNome(nome);
    }
}
