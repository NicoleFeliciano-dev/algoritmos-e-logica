package beecrowd.easy;
import java.util.Locale;
import java.util.Scanner;

public class N1011 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);
        double raio = input.nextFloat();

        double volume = (double) (4 * PI * Math.pow(raio,3))/3;
        System.out.printf("VOLUME = %.3f%n", volume);
    }
}
