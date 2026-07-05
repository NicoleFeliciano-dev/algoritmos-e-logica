package beecrowd.ad_hoc;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class N1030 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int quantidade = input.nextInt();
            int salto = input.nextInt();

            Queue<Integer> circulo = new LinkedList<>();
            for (int j = 0; j < quantidade; j++) {
                circulo.offer(j+1);
            }

            while (circulo.size() > 1) {
                for (int j = 0; j < salto-1; j++){
                    circulo.offer(circulo.poll());
                }
                circulo.poll();
            }

            System.out.println("Case "+(i+1)+": "+circulo.peek());
        }
    }
}
