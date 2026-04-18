package beecrowd.sequencial;

//TEMPO COM IF
import java.util.Scanner;

public class Ex1047 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hi = sc.nextInt();
        int mi = sc.nextInt();
        int hf = sc.nextInt();
        int mf = sc.nextInt();

        int inicio = hi * 60 * 60 + mi * 60;
        int fim = hf * 60 * 60 + mf * 60;
        int duracao;

        if (fim <= inicio) {
            duracao = (24 * 60 * 60 - inicio) + fim;
        } else {
            duracao = fim - inicio;
        }

        int H = duracao / (60 * 60);
        int resto = duracao % (60 * 60);
        int M = resto / 60;

        System.out.println("O JOGO DUROU " + H + " HORA(S) E " + M + " MINUTO(S)");

        sc.close();
    }

}