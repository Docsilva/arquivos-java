package vetores;

import java.util.Scanner;

public class ListaNumericos {

	public static Scanner leia = new Scanner (System.in);
	public static void main(String[] args) {


		int[] vetor = new int [10]; // vetor tamanho fixo e vazio
		int[] vetor2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // vetor com valores declarados
		
		
		//mostrar os valores que tem no vetor
		
		/*
		for (int i = 0; i < vetor2.length; i ++) {
			System.out.print(". " + vetor2[i]);
			Arrays.sort (vetor2); // organiza de forma crescente os numeros de um vetor
			Arrays.sort (vetor2, Collections.reverseOrder()); // organiza de forma decrescente os numeros de um vetor, precisa trocar a declaracao da variavel de int para Integer (classe)

			
		}
		
		//variavel nessa forma mostra o valor que esta ana posicao do vetor
		for (int mostra_dado : vetor2) {
			System.out.print(". " + mostra_dado);

		}
		*/
		
		//ler numeros do teclado e colocar no vetor
		for (int i = 0; i < vetor.length; i ++) {
			System.out.print("\nDigite um numero: ");
			vetor[i] = leia.nextInt();	
			
			if (vetor[i] % 2 == 0) {
				System.out.println("\nPar: " + vetor[i]);
			}
			else {
					System.out.println("\nImpar " + vetor[i]);
			}
		}

	}

}
