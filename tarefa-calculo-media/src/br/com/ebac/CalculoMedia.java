package br.com.ebac;

public class CalculoMedia {

    public static void main (String[] args) {

        System.out.println("********** CALCULO DE MÉDIA BIMESTRAL ***********");

        // Materias do semestre
        Linguagens portugues = new Linguagens();
        Linguagens ingles = new Linguagens();
        CienciasHumanas filosofia = new CienciasHumanas();
        CienciasHumanas historia = new CienciasHumanas();
        Exatas matematica = new Exatas();
        Exatas fisica = new Exatas();
        Exatas quimica = new Exatas();
        EducacaoFisica natacao = new EducacaoFisica();

        // Minhas notas
        portugues.inserirNota(7.0);
        ingles.inserirNota(6.5);
        filosofia.inserirNota(9.0);
        historia.inserirNota(10);
        matematica.inserirNota(7.8);
        fisica.inserirNota(8.2);
        quimica.inserirNota(3.2);
        natacao.inserirNota(4.0);

        double totalLinguagens;
        double totalCienciasHumanas;
        double totalExatas;
        double totalEdFisica;

        // Calculo de média bimestral
        totalLinguagens = portugues.getNota() + ingles.getNota();
        totalCienciasHumanas = filosofia.getNota() + historia.getNota();
        totalExatas = matematica.getNota() + fisica.getNota() + quimica.getNota();
        totalEdFisica = natacao.getNota();

        double media = (totalLinguagens + totalCienciasHumanas + totalExatas + totalEdFisica) / 4;

        System.out.println("Sua média bimestral é: " + media);
    }
}
