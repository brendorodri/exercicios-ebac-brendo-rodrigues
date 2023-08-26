package br.com.ebac;

import java.util.Scanner;

public class CalculoNota {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Nota primeiraNota = new Nota();
        Nota segundaNota = new Nota();
        Nota terceiraNota = new Nota();
        Nota quartaNota = new Nota();

        System.out.println("Digite sua primeira nota: ");
        primeiraNota.inserirMinhaNota(s.nextDouble());

        System.out.println("Digite sua segunda nota: ");
        segundaNota.inserirMinhaNota(s.nextDouble());

        System.out.println("Digite sua terceira nota : ");
        terceiraNota.inserirMinhaNota(s.nextDouble());

        System.out.println("Digite sua quarta nota: ");
        quartaNota.inserirMinhaNota(s.nextDouble());

        Double resultado = (primeiraNota.getMinhaNota() + segundaNota.getMinhaNota() + terceiraNota.getMinhaNota() + quartaNota.getMinhaNota()) / 4;

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
