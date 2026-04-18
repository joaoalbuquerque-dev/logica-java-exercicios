package beecrowd.condicionais;

//ANIMAL
import java.util.Scanner;

public class Ex1049 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String tipo = sc.nextLine();
		String classe = sc.nextLine();
		String alimentacao = sc.nextLine();

		if (tipo.equals("vertebrado")) {
			if (classe.equals("ave")) {
				if (alimentacao.equals("carnivoro")) {
					System.out.println("aguia");
				} else {
					System.out.println("pomba");
				}
			} else {
				if (alimentacao.equals("onivoro")) {
					System.out.println("homem");
				} else {
					System.out.println("vaca");
				}
			}
		} else {
			if (classe.equals("inseto")) {
				if (alimentacao.equals("hematofago")) {
					System.out.println("pulga");
				} else {
					System.out.println("lagarta");
				}
			} else {
				if (alimentacao.equals("hematofago")) {
					System.out.println("sanguessuga");
				} else {
					System.out.println("minhoca");
				}
			}
		}

		sc.close();
	}
}