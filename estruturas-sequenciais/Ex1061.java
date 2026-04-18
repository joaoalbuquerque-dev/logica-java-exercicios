package beecrowd.sequencial;

import java.util.Scanner;

public class Ex1061 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int W, X, Y, Z, inicio, fim, duracao, resto;

        sc.next();
        int diaInicio = sc.nextInt();

        int horaInicio = sc.nextInt();
        sc.next();
        int minutoInicio = sc.nextInt();
        sc.next();
        int segundoInicio = sc.nextInt();

        sc.next();
        int diaFim = sc.nextInt();

        int horaFim = sc.nextInt();
        sc.next();
        int minutoFim = sc.nextInt();
        sc.next();
        int segundoFim = sc.nextInt();

        inicio = diaInicio * 24 * 60 * 60 + horaInicio * 60 * 60 + minutoInicio * 60 + segundoInicio;
        fim = diaFim * 24 * 60 * 60 + horaFim * 60 * 60 + minutoFim * 60 + segundoFim;
        duracao = fim - inicio;

        W = duracao / (24 * 60 * 60);
        resto = duracao % (24 * 60 * 60);
        X = resto / (60 * 60);
        resto = resto % (60 * 60);
        Y = resto / 60;
        Z = resto % 60;

        System.out.println(W + " dia(s)");
        System.out.println(X + " hora(s)");
        System.out.println(Y + " minuto(s)");
        System.out.println(Z + " segundo(s)");

        sc.close();
    }

}