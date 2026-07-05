package beecrowd.strings;

import java.util.Scanner;

public class N1120 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String valor = input.next();

        while (n != 0 || !valor.equals("0")){
            StringBuilder novoValorString = new StringBuilder();
            boolean valorNulo = true;

            for (int i = 0; i < valor.length(); i++){
                char algarismo =  valor.charAt(i);

                if (Integer.parseInt(String.valueOf(algarismo)) != n){
                    novoValorString.append(algarismo);
                }
            }

            StringBuilder aux = new StringBuilder();

            for (int i = 0; i < novoValorString.length(); i++){
                char algarismo =  novoValorString.charAt(i);

                if (algarismo != '0'){
                    valorNulo = false;
                    aux.append(algarismo);
                }else {
                    if (!valorNulo){
                        aux.append(algarismo);
                    }
                }
            }

            if (aux.toString().isEmpty()){
                aux = new StringBuilder("0");
            }

            novoValorString = new StringBuilder(aux.toString());
            System.out.println(novoValorString);

            n = input.nextInt();
            valor = input.next();
        }
    }
}
