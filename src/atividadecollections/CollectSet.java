package atividadecollections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectSet {

	public static void main(String[] args) {
		Set<Integer> setNumeros = new HashSet<Integer>();

		setNumeros.add(2);
		setNumeros.add(5);
		setNumeros.add(1);
		setNumeros.add(3);
		setNumeros.add(4);
		setNumeros.add(9);
		setNumeros.add(7);
		setNumeros.add(8);
		setNumeros.add(10);
		setNumeros.add(6);

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o número que quer encontrar : ");

		int numero = leia.nextInt();

		if (setNumeros.contains(numero)) {
			System.out.println("O número " + numero + " foi encontrado !");
		} else {
			System.out.println("O número " + numero + " não foi encontrado !");
		}

	}
}
