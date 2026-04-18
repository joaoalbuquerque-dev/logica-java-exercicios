package beecrowd.condicionais;

//MEDIA DE NUMEROS POSITIVOS
import java.util.Locale;
import java.util.Scanner;

public class Ex1064 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();

        int positivo = 0;
        double soma = 0;

        if (a > 0) {
            positivo++;
            soma += a;
        }
        if (b > 0) {
            positivo++;
            soma += b;
        }
        if (c > 0) {
            positivo++;
            soma += c;
        }
        if (d > 0) {
            positivo++;
            soma += d;
        }
        if (e > 0) {
            positivo++;
            soma += e;
        }
        if (f > 0) {
            positivo++;
            soma += f;
        }
        double media = soma / positivo;
        System.out.println(positivo + " valores positivos");
        System.out.printf("%.1f%n", media);
        sc.close();
    }

}