package beecrowd.matriz;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        int [][] A = new int[M][N];
        int [][] B = new int[M][N];
        int [][] C = new int[M][N];

        //Lendo a matriz 1 
        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        //Lendo a matriz 2
        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        //Atribuindo a soma das matrizes 1 e 2 a C
        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        //Percorrendo a Matriz e imprimindo a tela 
        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }



        sc.close();
    }

}