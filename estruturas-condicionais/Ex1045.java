package beecrowd.condicionais;

//TIPOS DE TRIANGULO
import java.util.Locale;
import java.util.Scanner;

public class Ex1045 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double temp = 0;

        if (A < B) {
            temp = A;
            A = B;
            B = temp;
        }
        if (A < C) {
            temp = A;
            A = C;
            C = temp;
        }
        if (B < C) {
            temp = B;
            B = C;
            C = temp;
        }

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {

            if (A * A == B * B + C * C) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (A * A > B + B + C * C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (A * A < B * B + C * C) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if (A == B || A == C || B == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
            sc.close();
        }

    }
}