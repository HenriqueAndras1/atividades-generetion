package atividadecollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class CollectionList {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();

		System.out.println("Digite 5 cores: ");

		String y = String.valueOf(cores);

		for (int i = 0; i < 5; i++) {
			System.out.print("\nDigite a cor " + (i + 1) + ": ");
			String cor = leia.next();
			cores.add(cor);

		}
		System.out.println("\nListar todas as cores: ");
		for (String cor : cores) {
			System.out.println(cor);
		}
		cores.sort(null);

		System.out.println("\nCores ordenadas: ");
		for (String cor : cores) {
			System.out.println(cor);
		}
	}
}