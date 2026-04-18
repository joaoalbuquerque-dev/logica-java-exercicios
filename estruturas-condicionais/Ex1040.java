package beecrowd.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex1040 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();
        float n4 = sc.nextFloat();

        float media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / (2 + 3 + 4 + 1);

        float exame = 0;
        float mediaFinal = 0;

        if (media >= 7.0) {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno reprovado.");
        } else {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno em exame.");

            exame = sc.nextFloat();
            mediaFinal = (media + exame) / 2;
            System.out.println("Nota do exame: " + exame);
            if (mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media Final: %.1f%n", mediaFinal);
        }

        sc.close();
    }

}
