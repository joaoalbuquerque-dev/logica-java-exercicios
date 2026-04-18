package beecrowd.repeticao.fors;
//SOMA DE IMPARES CONSECUTIVOS
import java.util.Scanner;

public class Ex1071 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int min, max;

        if (X < Y){
            min = X;
            max = Y;
        }
        else {
            min = Y;
            max = X;
        }
        int soma = 0;
        for (int i=min+1;i<max;i++) {
            if (i % 2 != 0){
              soma = soma +i;
            }
        }
        System.out.println(soma);
        sc.close();
    }
    
}