package beecrowd.ad_hoc;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class N1031 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cidades = input.nextInt();

        while (cidades != 0){
            Queue<Integer> cidadesFila = new LinkedList<>();
            final int CIDADE_PRINCIPAL = 13;

            for (int i = 0; i < cidades; i++) {
                cidadesFila.add(i+1);
            }

            boolean encontrouMenorValor = false;
            int saltos = 1;

            while (!encontrouMenorValor) {
                for (int i = 0; i < saltos-1; i++) {
                    cidadesFila.offer(cidadesFila.poll());
                }

                int cidadeAtual;

                if (!cidadesFila.isEmpty()) {
                    cidadeAtual = cidadesFila.poll();

                    if (cidadeAtual == CIDADE_PRINCIPAL){
                        if (!cidadesFila.isEmpty()) {
                            saltos++;
                            cidadesFila.clear();

                            for (int i = 0; i < cidades; i++) {
                                cidadesFila.add(i+1);
                            }

                            cidadesFila.poll();

                        }else {
                            encontrouMenorValor = true;
                        }
                    }
                }
            }

            System.out.println(saltos);
            cidades = input.nextInt();
        }
    }
}
