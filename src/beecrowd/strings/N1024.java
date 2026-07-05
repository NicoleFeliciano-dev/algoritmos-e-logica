package beecrowd.strings;

import java.util.Scanner;

public class N1024 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            String senha = input.nextLine();
            StringBuilder senhaCriptografada = new StringBuilder();
            String aux;

            for (int j = 0; j < senha.length(); j++) {
                char senhaChar = senha.charAt(j);

                if (Character.isLetter(senhaChar)) {
                    int cod = (int) senhaChar + 3;
                    senhaCriptografada.append((char) cod);
                }else {
                    senhaCriptografada.append(senhaChar);
                }
            }

            aux = senhaCriptografada.toString();
            senhaCriptografada = new StringBuilder();

            for (int j = senha.length()-1; j >= 0; j--) {
                char senhaChar = aux.charAt(j);
                senhaCriptografada.append(senhaChar);
            }

            aux = senhaCriptografada.toString();
            senhaCriptografada = new StringBuilder();

            for (int j = 0; j < senha.length(); j++) {
                char senhaChar = aux.charAt(j);

                if (j >= senha.length()/2){
                    int cod = (int) senhaChar - 1;
                    senhaChar = (char)cod;
                }
                senhaCriptografada.append(senhaChar);
            }

            System.out.println(senhaCriptografada);
        }
    }
}
