package beecrowd.vetores;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] vet = new double[N];
        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextInt();
        }

        double somaPares = 0.0;
        int qtdPares = 0;

        for (int i = 0; i < N; i++) {
            if (vet[i] % 2 == 0) {
                somaPares += vet[i];
                qtdPares++;
            }
        }
        if (qtdPares == 0) {
            System.out.println("Não há números pares digitados");
        } else {
            double media = somaPares / qtdPares;
            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }

}
