package beecrowd.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex1021 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();
        int totalCentavos = (int) (valor * 100 + 0.5);

        int nota100 = totalCentavos / 10000;
        totalCentavos = totalCentavos % 10000;

        int nota50 = totalCentavos / 5000;
        totalCentavos = totalCentavos % 5000;

        int nota20 = totalCentavos / 2000;
        totalCentavos = totalCentavos % 2000;

        int nota10 = totalCentavos / 1000;
        totalCentavos = totalCentavos % 1000;

        int nota5 = totalCentavos / 500;
        totalCentavos = totalCentavos % 500;

        int nota2 = totalCentavos / 200;
        totalCentavos = totalCentavos % 200;
        // moedas
        int moeda100 = totalCentavos / 100;
        totalCentavos = totalCentavos % 100;

        int moeda50 = totalCentavos / 50;
        totalCentavos = totalCentavos % 50;

        int moeda25 = totalCentavos / 25;
        totalCentavos = totalCentavos % 25;

        int moeda10 = totalCentavos / 10;
        totalCentavos = totalCentavos % 10;

        int moeda5 = totalCentavos / 5;
        totalCentavos = totalCentavos % 5;

        int moeda1 = totalCentavos / 1;

        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moeda100 + " moeda(s) de R$ 1.00");
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda5 + " moeda(s) de R$ 0.05");
        System.out.println(moeda1 + " moeda(s) de R$ 0.01");

        sc.close();

    }

}