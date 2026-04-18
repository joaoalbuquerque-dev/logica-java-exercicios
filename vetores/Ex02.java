package beecrowd.vetores;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] vet = new int[N];

        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextInt();
        }

        int qtdPares = 0;

        for (int i = 0; i < N; i++) {
            if (vet[i] % 2 == 0) {
                System.out.print(vet[i] + " ");
                qtdPares++;
            }
        }
        System.out.println();
        System.out.println(qtdPares);

        sc.close();
    }

}
