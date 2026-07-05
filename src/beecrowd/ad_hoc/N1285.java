package beecrowd.ad_hoc;

import java.io.IOException;
import java.util.Scanner;

public class N1285 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        while (input.hasNextInt()) {
            int n = input.nextInt();
            int m = input.nextInt();
            int quantidade = 0;

            for (int numero = n; numero <= m; numero++){
                String numString = String.valueOf(numero);
                boolean numeroRepetido = false;

                for (int i = 0; i < numString.length(); i++) {
                    for (int j = 0; j < numString.length(); j++) {
                        char v1 = numString.charAt(i);
                        char v2 = numString.charAt(j);

                        if (i != j){
                            if (v1 == v2){
                                numeroRepetido = true;
                                break;
                            }
                        }
                    }
                }

                if (!numeroRepetido){
                    quantidade++;
                }
            }

            System.out.println(quantidade);
        }

        input.close();
    }
}
