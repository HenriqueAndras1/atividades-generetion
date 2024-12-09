package bancodedados;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class CollectionPilha {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();

		Scanner leia = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("\nEscolha uma das Opções: ");
			System.out.println("\n1 - Adicionar Livro na pilha");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da pilha");
			System.out.println("0 - Sair");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome de livro para adicionar: ");
				String cliente = leia.nextLine();
				pilha.add(cliente);
				System.out.println("\nO livro " + cliente + " foi adicionado !");
				break;

			case 2:
				System.out.println("\nLista de Livros na Pilha: ");

				Iterator<String> lista = pilha.iterator();

				while (lista.hasNext()) {
					System.out.println(lista.next());
				}
				break;

			case 3:
				if (pilha.isEmpty()) {
					System.out.println("A Pilha está vazia!");
				} else {
					pilha.pop();
					System.out.println("\nPilha: ");

					Iterator<String> retira = pilha.iterator();

					while (retira.hasNext()) {
						System.out.println(retira.next());
					}
					System.out.println("\nUm Livro foi retirado da pilha ! ");
				}
				break;
				
			case 0:
				System.out.println("Programa Finalizado !");
				break;

			default:
				System.out.println("Opção inválida! Tente novamente.");
			}
		} while (opcao != 0);

		leia.close();

	}

}
