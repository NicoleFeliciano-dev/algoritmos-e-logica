package beecrowd.easy;

import java.util.Scanner;

//Problems ID: #1047 - Tempo de Jogo com Minutos
//https://judge.beecrowd.com/pt/problems/view/1047

public class N1047 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horaInicial = input.nextInt();
        int minutoInicial = input.nextInt();
        int horaFinal = input.nextInt();
        int minutoFinal = input.nextInt();


        int minutosTotais = 0;
        if (minutoFinal < minutoInicial) {
            minutosTotais = 60 - minutoInicial + minutoFinal;
        }else{
            minutosTotais = minutoFinal - minutoInicial;
        }

        int horasTotais = 0;

        if (horaFinal == horaInicial) {
            if (minutoFinal < minutoInicial){
                horasTotais = 23;
            } else if (minutoFinal == minutoInicial) {
                horasTotais = 24;
            }

        }else if (horaFinal > horaInicial) {
            horasTotais = horaFinal - horaInicial;

            if (minutoFinal < minutoInicial) {
                horasTotais -= 1;
            }
        }else{
            horasTotais = horaFinal+24 - horaInicial;

            if (minutoFinal < minutoInicial) {
                horasTotais -= 1;
            }
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n",horasTotais,minutosTotais);

    }
}
