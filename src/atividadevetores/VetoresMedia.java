package atividadevetores;

import java.util.Scanner;

public class VetoresMedia {

	public static void main(String[] args) {

		int numero[] = new int[10];
		int digito = 0, indice = 0, soma = 0, pares = 0;
		double media = 0;

		Scanner leia = new Scanner(System.in);

		for (indice = 0; indice < 10; indice++) {
			System.out.print("\nDigite um número que você desejar: ");
			numero [indice] = leia.nextInt();
			soma = soma + numero [indice];
		}
		System.out.print("\nElemento nos indeces impares: ");
		media = (float) soma/10;
		for (indice = 0; indice < 10; indice++) {
			if (indice % 2 == 1){
				System.out.print(" "+ numero [indice]);
			}
		}
		System.out.print("\nElementos Pares: ");
		for (indice = 0; indice < 10; indice++) {
			if (numero [indice] % 2 == 0) {
				System.out.print(" "+ numero [indice]);
			}
		}
		System.out.println("\nSoma: "+ soma);
		System.out.printf("\nMedia: %.2f", media);
	}
}
