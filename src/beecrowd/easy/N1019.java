package beecrowd.easy;

import java.util.Scanner;

public class N1019 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int segundosTotais = input.nextInt();

        int horas = segundosTotais / 3600;
        int minutos = segundosTotais % 3600 / 60;
        int segundos = segundosTotais % 60;

        System.out.printf("%d:%d:%d%n",horas,minutos,segundos);
    }
}
