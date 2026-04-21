package beecrowd.repeticao.fors;

import java.util.Scanner;

public class Ex1073 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int N = sc.nextInt();

        for (int i =1; i<= N; i++) {
            if (i % 2 == 0){
                int quadrado = i * i;
                System.out.println(i +"^2 = " +quadrado);
            }
        }

        sc.close();
    }
    
}
