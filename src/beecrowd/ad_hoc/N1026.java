package beecrowd.ad_hoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String linha;
        while ((linha = br.readLine()) != null) {

            String[] valores = linha.split(" ");

            long n1 = Long.parseLong(valores[0]);
            long n2 = Long.parseLong(valores[1]);

            System.out.println(n1^n2);
        }
    }
}
