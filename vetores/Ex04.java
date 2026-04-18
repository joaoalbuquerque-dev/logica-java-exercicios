package beecrowd.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] vet = new double[N];
        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextDouble();
        }

        double cont = 0.0;
        for (int i = 0; i < N; i++) {
            cont = cont + vet[i];
        }
        double media = cont / N;
        System.out.printf("%.3f%n ", media);

        for (int i = 0; i < N; i++) {
            if (vet[i] < media) {
                System.out.printf("%.1f%n", vet[i]);
            }

        }

        sc.close();
    }

}
