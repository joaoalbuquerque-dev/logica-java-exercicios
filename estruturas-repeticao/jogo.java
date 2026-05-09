package beecrowd.trainning;

//Jogo de advinhação
import java.util.Scanner;
import java.util.Random;

public class jogo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;

        System.out.println("==JOGO DE ADVINHÇÃO==");
        System.out.println("Tente advinhar de 1 a 100");
        int palpite = 0;
        int tentativas = 0;
        int minimo = 1;
        int maximo = 100;

        while (palpite != numeroSecreto) {
            System.out.println("Você está no intervalo de " + minimo + " a " + maximo);
            System.out.println();
            System.out.print("Digite seu palpite: ");
            palpite = sc.nextInt();
            tentativas++;

            if (palpite > numeroSecreto) {
                maximo = palpite - 1;
                System.out.println("Está mais abaixo");

            } else if (palpite < numeroSecreto) {
                minimo = palpite + 1;
                System.out.println("Está mais acima");
            } else {
                System.out.println("Parabéns você acertou");
                System.out.println("Número de tentativas: " + tentativas);
            }
        }

        sc.close();
    }

}
