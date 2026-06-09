package beecrowd.easy;

import java.util.Scanner;

//Problems ID: #1050 - DDD
//https://judge.beecrowd.com/pt/problems/view/1050

public class N1050 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ddd = input.nextInt();

        String destino = switch (ddd) {
            case 61 -> "Brasilia";
            case 71 -> "Salvador";
            case 11 -> "Sao Paulo";
            case 21 -> "Rio de Janeiro";
            case 32 -> "Juiz de Fora";
            case 19 -> "Campinas";
            case 27 -> "Vitoria";
            case 31 -> "Belo Horizonte";
            default -> "DDD nao cadastrado";
        };

        System.out.println(destino);
    }
}
