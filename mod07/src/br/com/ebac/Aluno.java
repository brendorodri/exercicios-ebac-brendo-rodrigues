package br.com.ebac;

public class Aluno {
    private String nome;

    private String turma;

    private String anoEscolar;

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

    public String getAnoEscolar() {
        return anoEscolar;
    }

    public void setAnoEscolar(String anoEscolar) {
        this.anoEscolar = anoEscolar;
    }

    public void inserirNomeAluno(String nome) {
        setNome(nome);
    }

    public void inserirAnoEscolar(String ano) {
        setAnoEscolar(ano);
    }

    public void inserirTurmaAluno(String turma) {
        setTurma(turma);
    }
}
