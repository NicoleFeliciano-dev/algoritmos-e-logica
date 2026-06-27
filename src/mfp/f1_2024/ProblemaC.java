package mfp.f1_2024;

import java.util.Scanner;

public class ProblemaC {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        int tamanho = (int) Math.pow(2,numero) - 1;

        int[] moedas = new int[tamanho];
        for  (int i = 0; i < tamanho; i++) {
            moedas[i] = input.nextInt();
        }

        int limite = (int) Math.pow(2,numero-1);
        int pontoAtual = 1;

        int moedasAtuais = 0;
        int valorAntigo = moedasAtuais;

        int valorRepeat = 1;


        while (pontoAtual < limite) {
            pontoAtual *= 2;
            valorRepeat ++;
        }

        String arvorePossibilidades = "0".repeat(valorRepeat);
        int tamanhoString = arvorePossibilidades.length();

        int numeroPossibilidades = Integer.parseInt(arvorePossibilidades, 2);
        int casosMax = (int) Math.pow(2,arvorePossibilidades.length());

        for (int i = 0; i < casosMax; i++) {
            pontoAtual = 1;
            moedasAtuais = 0;

            for (int j = 0; j < arvorePossibilidades.length(); j++) {
                moedasAtuais += moedas[pontoAtual-1];

                if (pontoAtual < limite) {
                    char valorAtual = arvorePossibilidades.charAt(j);

                    if (valorAtual == '0'){
                        pontoAtual *= 2;
                    }else {
                        pontoAtual = pontoAtual * 2 + 1;
                    }

                }else {
                    break;
                }
            }

            if (moedasAtuais > valorAntigo){
                valorAntigo = moedasAtuais;
            }

            numeroPossibilidades ++;

            String binario = Integer.toString(numeroPossibilidades,2);
            arvorePossibilidades = String.format("%"+tamanhoString+"s", binario).replace(' ', '0');
        }

        System.out.println(valorAntigo);
        for (int i = 0; i < 10; i++) {
            System.out.println("Passo " + i);
            Thread.sleep(500);
        }
    }
}
