package beecrowd.condicionais;

//SEQUENCIA DE IMPARES
import java.util.Scanner;

public class Ex1070 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x % 2 == 0) {
            x++;
        }
        System.out.println(x);
        System.out.println(x + 2);
        System.out.println(x + 4);
        System.out.println(x + 6);
        System.out.println(x + 8);
        System.out.println(x + 10);

        sc.close();

    }

}
