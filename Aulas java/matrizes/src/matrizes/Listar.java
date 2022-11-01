package matrizes;

import java.util.Scanner;

public class Listar {
	public static Scanner leia = new Scanner (System.in);
	public static void main(String[] args) {


		int[][] matriz = {{1, 2, 3,}, {4, 5, 6}, {7, 8, 9}}; // vetor com valores declarados
		
		int [][] matriz2 = new int [4][3]; // matriz tamanho fixo e vazio
		
		
		// for para mostrar dados da matriz de tamanho igual
		/*
		for (int i = 0; i < matriz.length; i ++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("\n" + matriz[i][j]);
			}
		}
		*/
		
		//ler matriz nao quadrada
		for (int i = 0; i < matriz2.length; i ++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				System.out.println("\nEntre com o valor: ");
				matriz2[i][j] = leia.nextInt();
			}
		}		
		//exibir matriz nao quadrada
		for (int i = 0; i < matriz2.length; i ++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				System.out.println("\n[" + i + "][" + j + "]: " + matriz2[i][j]);
			}
		}
	}

}
