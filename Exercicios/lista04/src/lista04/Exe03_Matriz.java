package lista04;

import java.util.Scanner;

public class Exe03_Matriz {

	public static Scanner leia = new Scanner (System.in);
	public static void main(String[] args) {


		int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int tamanho = 3;
		int somaS = 0, somaP = 0, i,j;
		

		System.out.print("Elementos da diagonal principal:\n");
		for (i = 0; i < tamanho; i++) {
			
			somaP = somaP + matriz[i] [i];
			System.out.print(matriz[i] [i] + " | ");
		}
		
		System.out.println("\n\nElementos da diagonal secundária:");
		for (i = 0; i < tamanho; i++) {
			somaS = somaS + matriz[i] [tamanho -1 - i];
			System.out.print(matriz [i] [tamanho - 1 - i] + " | ");
		}
		System.out.print("\n\nSoma dos elementos diagonal principal:\n" + somaP);
		System.out.print("\n\nSoma dos elementos diagonal secundaria:\n" + somaS);

	}

}
