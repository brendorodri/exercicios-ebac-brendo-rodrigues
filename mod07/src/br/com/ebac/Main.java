package br.com.ebac;

/**
 * @author brendo.rodrigues
 */

public class Main {

    public static void main (String[] args) {
        Aluno aluno = new Aluno();
        Disciplina disciplina = new Disciplina();
        Professor professor = new Professor();

        aluno.inserirNomeAluno("Antonio");
        aluno.inserirAnoEscolar("6º Ano");
        aluno.inserirTurmaAluno("B");

        disciplina.inserirNomeDisciplina("Espanhol");
        disciplina.inserirNotaAluno(8);

        professor.inserirNomeProfessor("Hernandez");

        System.out.println("A nota do aluno " + aluno.getNome() + ", da turma/ano " + aluno.getAnoEscolar() + " " + aluno.getTurma() + ", na disciplina de " + disciplina.getNome() + " do professor " + professor.getNome() + " foi de " + disciplina.getNota() + " pontos.");
    }

}
