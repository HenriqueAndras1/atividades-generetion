package atividadevetores;

import java.util.Scanner;

public class vetores {

	public static void main(String[] args) {

		int numeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int contador;
		int digito;
		int encontrado = 0;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.print("\nDigite o número que você desejar encontrar: ");
			digito = leia.nextInt();

			for (contador = 0; contador < 10; contador++) {
				if (digito == numeros[contador]) {
					System.out.println("\nO número " + digito + " está localizado na posição: " + contador);
					encontrado++;
				}
			}
			if (encontrado == 0) {
				System.out.println("\nO número " + digito + " não foi encontrado ! ");
			}
			System.out.print("");
		} while (digito != 0);
		leia.close();
	}

}
