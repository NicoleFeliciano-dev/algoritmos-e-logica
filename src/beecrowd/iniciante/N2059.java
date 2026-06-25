package beecrowd.iniciante;

import java.util.Scanner;

public class N2059 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt(); //se p=1 par, se p = 0 então o jogador 1 escolheu ímpar
        int j1 = input.nextInt();
        int j2 = input.nextInt();

        int r = input.nextInt(); //r = 1 então o jogador 1 roubou, se r = 0 então o jogador 1 não roubou
        int a = input.nextInt(); //a = 1 então o jogador 2 acusou o jogador 1 de roubo, se a = 0 então ele não acusou o jogador 1 de roubo

        int ganhador;
        int soma = j1 + j2;

        if (r == 1){
            if (a == 1){
                ganhador = 2;
            }else {
                ganhador = 1;
            }
        }else{
            if (a == 1){
                ganhador = 1;
            }else {
                if (p == 1) { //par
                    if (soma % 2 == 0) {
                        ganhador = 1;
                    } else {
                        ganhador = 2;
                    }
                } else {
                    if (soma % 2 == 0) {
                        ganhador = 2;
                    } else {
                        ganhador = 1;
                    }
                }
            }
        }
        System.out.println("Jogador "+ganhador+" ganha!");
    }
}
