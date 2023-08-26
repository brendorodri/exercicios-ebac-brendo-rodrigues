package br.com.ebac;

import java.util.Scanner;

public class CalculoNota {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Nota portugues = new Nota();
        Nota matematica = new Nota();
        Nota geografia = new Nota();
        Nota historia = new Nota();

        System.out.println("Digite sua nota de Portugues: ");
        portugues.inserirMinhaNota(s.nextDouble());

        System.out.println("Digite sua nota de Matematica: ");
        matematica.inserirMinhaNota(s.nextDouble());

        System.out.println("Digite sua nota de Historia: ");
        historia.inserirMinhaNota(s.nextDouble());

        System.out.println("Digite sua nota de Geografia: ");
        geografia.inserirMinhaNota(s.nextDouble());

        Double resultado = (matematica.getMinhaNota() + portugues.getMinhaNota() + historia.getMinhaNota() + geografia.getMinhaNota()) / 4;

        System.out.println("Sua média é igual: " + resultado);
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
