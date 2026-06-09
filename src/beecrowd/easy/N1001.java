package beecrowd.easy;
import java.io.IOException;
import java.util.Scanner;

public class N1001 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        Integer a = input.nextInt();
        Integer b = input.nextInt();

        System.out.println("X = "+(a+b));
    }
}
