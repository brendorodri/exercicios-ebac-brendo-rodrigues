package br.com.ebac;

import java.util.Scanner;

public class CalculoNota {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        Double nota = s.nextDouble();

        String resultado = getNota(nota);

        System.out.println("Resultado: " + resultado);
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
