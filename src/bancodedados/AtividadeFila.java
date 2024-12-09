package bancodedados;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtividadeFila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();
		Scanner leia = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("\nEscolha uma das Opções: ");
			System.out.println("\n1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do cliente para adicionar à fila: ");
				String cliente = leia.nextLine();
				fila.add(cliente);
				System.out.println("\nCliente " + cliente + " adicionado à fila !");
				break;

			case 2:
				System.out.println("\nLista de Clientes na Fila: ");

				Iterator<String> lista = fila.iterator();

				while (lista.hasNext()) {
					System.out.println(lista.next());
				}
				break;

			case 3:
				if (fila.isEmpty()) {
					System.out.println("A Fila está vazia!");
				} else {
					fila.remove();
					System.out.println("\nFila: ");

					Iterator<String> retira = fila.iterator();

					while (retira.hasNext()) {
						System.out.println(retira.next());
					}
					System.out.println("\nO cliente foi Chamado ! ");
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
