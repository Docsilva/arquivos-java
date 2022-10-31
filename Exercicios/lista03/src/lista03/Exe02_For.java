 package lista03;

import java.util.Scanner;

public class Exe02_For {

	
	public static Scanner leia = new Scanner (System.in);
	public static void main(String[] args) {
		
		int num, res = 0, par = 0, impar = 0;
		
		for (int i = 1; i < 11; i++) {
			
			System.out.print("Digite um numero inteiro: ");
			num = leia.nextInt();
			res = (num % 2);
			
			if (res == 0 ) {
				par += 1;
				
			}else {
				impar += 1;
					
			}
				
		}
		
		System.out.println("\nA quantidade de numeros pares é de: " + par);
		System.out.println("\nA quantidade de numeros impares é de: " + impar);
			
	}

}
