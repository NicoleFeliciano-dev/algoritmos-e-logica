package beecrowd.ad_hoc;

import java.io.IOException;
import java.util.Scanner;

public class N1087 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {

            int x1 = input.nextInt();
            if (x1 == 0) break;
            int y1 = input.nextInt();
            if (y1 == 0) break;
            int x2 = input.nextInt();
            if (x2 == 0) break;
            int y2 = input.nextInt();
            if (y2 == 0) break;

            int jogadas = 0;

            if (!(x1 == x2 && y1 == y2)) {
                jogadas++;

                if (!(Math.abs(x2-x1) == Math.abs(y2-y1)) && !(x1 == x2 || y1 == y2)){
                    jogadas++;
                }
            }
            System.out.println(jogadas);
        }



    }
}
