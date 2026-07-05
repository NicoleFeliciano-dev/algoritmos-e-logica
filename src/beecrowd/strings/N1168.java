package beecrowd.strings;

import java.util.Scanner;

public class N1168 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++){
            String numero =  input.next();
            int totalLeds = 0;

            for (int j = 0; j < numero.length(); j++){
                char algarismo = numero.charAt(j);

                switch (algarismo){
                    case '0', '6', '9':
                        totalLeds += 6;
                        break;
                    case '1':
                        totalLeds += 2;
                        break;
                    case '2', '5', '3':
                        totalLeds += 5;
                        break;
                    case '4':
                        totalLeds += 4;
                        break;
                    case '7':
                        totalLeds += 3;
                        break;
                    case '8':
                        totalLeds += 7;
                        break;
                }
            }

            System.out.println(totalLeds + " leds");
        }
    }
}
