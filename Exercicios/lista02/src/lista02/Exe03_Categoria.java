package lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe03_Categoria {

	public static void main(String[] args) {


		Scanner leia = new Scanner (System.in);

		int idade;
		
		System.out.print("Digite a idade: ");
		idade = leia.nextInt();	
		
		
		if (idade >= 10 && idade < 25) {
		
			if (idade >= 10 && idade < 15) {
				
				System.out.println("\nVocê esta na categoria infantil");
			}
			if (idade >= 15 && idade < 18) {
				
				System.out.println("\nVocê esta na categoria juvenil");
				
			}
			if (idade >= 18 && idade < 25) {
				
				System.out.println("\nVocê esta na categoria adulto");
				
			}
		}
		else {
			System.out.println("Idade não é valida, tente novamente");
		}
		
	}

}
