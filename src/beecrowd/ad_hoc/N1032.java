package beecrowd.ad_hoc;

import java.util.*;

public class N1032 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            int quantidade = input.nextInt();
            if (quantidade == 0){
                break;
            }
            int salto = 2;

            Deque<Integer> circulo = new ArrayDeque<>();
            for (int j = 0; j < quantidade; j++) {
                circulo.offer(j+1);
            }

            while (circulo.size() > 1) {
                int rotacoes;
                if (salto > quantidade && salto % quantidade != 0) {
                    rotacoes = (salto - 1) % circulo.size();
                }else {
                    rotacoes = salto - 1;
                }

                for (int j = 0; j < rotacoes; j++){
                    circulo.offer(circulo.poll());
                }
                circulo.poll();
                salto = coletarProximoPrimo(salto);
            }

            System.out.println(circulo.peek());
        }
    }

    private static int coletarProximoPrimo(int salto){
        int proximoPrimo = salto+1;

        if (proximoPrimo % 2 == 0) {
            proximoPrimo ++;
        }

        boolean isPrimo = false;
        while (!isPrimo){

            boolean v = false;

            for (int i = 3; i * i <= proximoPrimo; i += 2) {
                if (proximoPrimo % i == 0) {
                    v = true;
                    break;
                }
            }

            if (v){
                proximoPrimo+=2;
            }else {
                isPrimo = true;
            }
        }

        return proximoPrimo;
    }
}
