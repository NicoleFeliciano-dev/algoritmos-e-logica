package beecrowd.iniciante;

import java.util.HashMap;
import java.util.Scanner;

public class N2632 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        HashMap<String, Integer> baseDano = new HashMap<>();
        HashMap<String, int[]> niveisRaio = new HashMap<>();

        baseDano.put("fire", 200);
        niveisRaio.put("fire", new int[]{20, 30, 50});

        baseDano.put("water", 300);
        niveisRaio.put("water", new int[]{10, 25, 40});

        baseDano.put("earth", 400);
        niveisRaio.put("earth", new int[]{25, 55, 70});

        baseDano.put("air", 100);
        niveisRaio.put("air", new int[]{18, 38, 60});

        for (int i = 0; i < t; i++) {
            int w = input.nextInt();
            int h = input.nextInt();

            int x0 = input.nextInt();
            int y0 = input.nextInt();

            String magia = input.next();
            int n = input.nextInt();

            int cx = input.nextInt();
            int cy = input.nextInt();

            int raio;
            int dano;

            dano = baseDano.get(magia);
            raio = niveisRaio.get(magia)[n - 1];

            int xAbsoluto = x0 + w;
            int yAbsoluto = y0 + h;

            int danoDefinitivo = 0;

           //é necessário verificar se os pontos entre o retangulo

            if (cx >= x0 && cx <= xAbsoluto && cy >= y0 && cy <= yAbsoluto) {
                danoDefinitivo = dano;
            } else if (cx >= x0 && cx <= xAbsoluto) {
                double distacia;

                if (cy > yAbsoluto) {
                     distacia = cy - yAbsoluto;
                }else{
                    distacia = Math.abs(cy - y0);
                }

                if (raio >= distacia) {
                    danoDefinitivo = dano;
                }
            }else if (cy >= y0 && cy <= yAbsoluto){
                double distacia;

                if (cx > xAbsoluto) {
                    distacia = cx - xAbsoluto;
                }else{
                    distacia = Math.abs(cx - x0);
                }

                if (raio >= distacia) {
                    danoDefinitivo = dano;
                }
            }else {
                double distacia;
                if (cy > yAbsoluto) {
                    if (cx > xAbsoluto) {
                        distacia = Math.sqrt(Math.pow((cy-yAbsoluto),2)+Math.pow((cx-xAbsoluto),2));
                    }else{
                        distacia = Math.sqrt(Math.pow((cy-yAbsoluto),2)+Math.pow((cx-x0),2));
                    }
                }else {
                    if (cx > xAbsoluto) {
                        distacia = Math.sqrt(Math.pow((cy-y0),2)+Math.pow((cx-xAbsoluto),2));
                    }else{
                        distacia = Math.sqrt(Math.pow((cy-y0),2)+Math.pow((cx-x0),2));
                    }
                }

                if (raio >= distacia) {
                    danoDefinitivo = dano;
                }
            }

            System.out.println(danoDefinitivo);

        }
    }
}
