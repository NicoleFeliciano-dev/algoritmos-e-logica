package mfp.f1_2024;

import java.util.Scanner;

public class ProblemaA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroParticipantes = input.nextInt();
        long quantPizzas = input.nextLong();

        long[] tempoPorParticipantes = new long[numeroParticipantes];

        for (int i = 0; i < tempoPorParticipantes.length; i++){
            tempoPorParticipantes[i] = input.nextLong();
        }

        long tempoEstimadoMax = 1_000_000_000_000_000_000L;
        long tempoEstimadoMin = 0;

        long somaPorPizzas;

        while (tempoEstimadoMin < tempoEstimadoMax) {
            somaPorPizzas = 0;
            long meio = tempoEstimadoMin + (tempoEstimadoMax - tempoEstimadoMin) / 2;

            for (long tempoPorParticipante : tempoPorParticipantes) {
                somaPorPizzas += (meio / tempoPorParticipante);

                if (somaPorPizzas > quantPizzas) {
                    break;
                }
            }

            if (somaPorPizzas >= quantPizzas) {
                tempoEstimadoMax = meio;
            } else{
                tempoEstimadoMin = meio+1;
            }
        }

        System.out.println(tempoEstimadoMin);
    }
}
