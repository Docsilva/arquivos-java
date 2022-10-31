package lista03;

import java.util.Scanner;

public class Exe05_DoWhile {
	
	
	public static Scanner leia = new Scanner (System.in);
	public static void main(String[] args) {


		int num = 0, soma = 0;
		
		System.out.print("Entre com um numero qualquer\nPara encerrar o programa entre com numero 0\n\n ");

		
		do {
			
			System.out.print(" numero: ");
			num = leia.nextInt();
			
			if (num > 1) {
				soma += num;
			}
			
		}while(num != 0);
		
		System.out.println("\nA soma dos numeros positivos é: " + soma);
	}

}
