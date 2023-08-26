package br.com.ebac;

import java.util.Scanner;

public class CalculoNota {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Disciplina primeiraDisciplina = new Disciplina();
        Disciplina segundaDisciplina = new Disciplina();
        Disciplina terceiraNota = new Disciplina();
        Disciplina quartaDisciplina = new Disciplina();

        System.out.println("Digite sua primeira nota: ");
        primeiraDisciplina.inserirMinhaNota(s.nextDouble());

        System.out.println("Digite sua segunda nota: ");
        segundaDisciplina.inserirMinhaNota(s.nextDouble());

        System.out.println("Digite sua terceira nota : ");
        terceiraNota.inserirMinhaNota(s.nextDouble());

        System.out.println("Digite sua quarta nota: ");
        quartaDisciplina.inserirMinhaNota(s.nextDouble());

        Double resultado = (primeiraDisciplina.getMinhaNota() + segundaDisciplina.getMinhaNota() + terceiraNota.getMinhaNota() + quartaDisciplina.getMinhaNota()) / 4;

        System.out.println("Sua média é: " + resultado);
        System.out.println("Resultado: " + getNota(resultado));
    }

    public static String getNota(Double nota) {
        if (nota >= 7) {
            return "Aprovado";
        } else if (nota >=5) {
            return "Recuperação";
        }else {
            return "Reprovado";
        }
    }
}
