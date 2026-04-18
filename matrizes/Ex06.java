package beecrowd.matriz;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[][] mat = new double[N][N];
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                mat[i][j] = sc.nextDouble();
            }
        }
        int linha = sc.nextInt();
        int coluna = sc.nextInt();

        double soma = 0.0;
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if (mat[i][j] > 0.0) {
                    soma += mat[i][j];
                }
            }
        }
        System.out.printf("SOMA DOS POSITIVOS: %.1f%n", soma);

        System.out.print("LINHA ESCOLHIDA: ");
        for (int i=0; i<N; i++) {
            System.out.printf("%.1f ", mat[linha][i]);
        }
        System.out.println();

        System.out.print("COLUNA ESCOLHIDA: ");
        for (int j=0; j<N; j++) {
            System.out.printf("%.1f ",mat[j][coluna]);
        }
        System.out.println();

        System.out.print("DIAGONAL PRINCIPAL: ");
        for (int i=0; i<N; i++) {
            System.out.printf("%.1f ",mat[i][i]);
        }
        System.out.println();

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if (mat[i][j] < 0.0) {
                    mat[i][j] = mat[i][j] * mat[i][j];
                }
            }
        }
        System.out.println("MATRIZ ALTERADA: ");
        for (int i=0; i<N; i++){
            for (int j=0; j<N; j++) {
                System.out.printf("%.1f ",mat[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }

}