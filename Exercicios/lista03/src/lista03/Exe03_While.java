package lista03;

import java.util.Scanner;

public class Exe03_While {
	
	
	public static Scanner leia = new Scanner (System.in);
	public static void main(String[] args) {


		int idade = 0, menor = 0, maior = 0;

		
		System.out.print("Entre com uma idade valida\nPara encerrar o programa entre com um valor negativo\n\n ");

		
		
		while (idade >= 0) {
			
			System.out.print(" Idade: ");
			idade = leia.nextInt();
			
			if (idade < 21) {
				menor = menor + 1;
			}
			
			if (idade > 50) {
				maior += 1;
			}
			//teste = idade > 0;
		}
		System.out.println("Total de pessoas menores de 21 anos: \n" + (menor - 1));
		System.out.println("Total de pessoas maiores de 50 anos: \n" + maior);


	}

}
