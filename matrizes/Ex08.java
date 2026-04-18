package beecrowd.matrizes;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] mat = new int[M][N];

        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int fila = sc.nextInt();
        int linha = fila - 1;
        char tipo = sc.next().toUpperCase().charAt(0);

        int ultimo = mat[linha][N-1];
        int primeiro = mat[linha][0];

        if (tipo == 'D'){
            for (int j=N-1; j>0; j--) {
                mat[linha][j] = mat[linha][j-1];
            }
            mat[linha][0] = ultimo;
        }
        else if (tipo == 'E'){
            for (int j=0; j<N-1; j++){
                mat[linha][j] = mat[linha][j+1];
            }
            mat[linha][N-1] = primeiro;
        }

        for (int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        
        
        sc.close();
    }
    
}
