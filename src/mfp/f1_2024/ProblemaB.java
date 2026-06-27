package mfp.f1_2024;

import java.util.Scanner;

public class ProblemaB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] coordenadas = new int[4][2];

        for (int i = 0; i < coordenadas.length; i++) {
            coordenadas[i][0] = input.nextInt();
            coordenadas[i][1] = input.nextInt();
        }

        int xAnterior = coordenadas[0][0];
        int yAnterior = coordenadas[0][1];
        int yDistancia = 0;

        for (int i = 1; i < coordenadas.length; i++) {
            int x = coordenadas[i][0];
            int y = coordenadas[i][1];

            if (xAnterior == x){
                yDistancia = yAnterior - y;
                break;
            }
        }

        int area = yDistancia*yDistancia;
        System.out.println(area);
    }
}
