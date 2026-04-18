package beecrowd.vetores;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] nomes = new String[N];
        int[] idades = new int[N];

        for (int i = 0; i < N; i++) {
            nomes[i] = sc.next();
            idades[i] = sc.nextInt();
        }

        int maior = idades[0];
        int posicaoMaior = 0;
        int menor = idades[0];
        int posicaoMenor = 0;

        for (int i = 1; i < N; i++) {
            if (idades[i] > maior) {
                maior = idades[i];
                posicaoMaior = i;
            }
            if (idades[i] < menor) {
                menor = idades[i];
                posicaoMenor = i;
            }
        }
        System.out.println("Pessoa mais nova: " + nomes[posicaoMenor]);
        System.out.println("Pessoa mais velha: " + nomes[posicaoMaior]);

        sc.close();
    }

}
