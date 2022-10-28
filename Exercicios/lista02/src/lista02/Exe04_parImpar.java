package lista02;

import java.text.DecimalFormat;
import java.util.Scanner;
//import java.math.*;

public class Exe04_parImpar {

	public static void main(String[] args) {

		
		Scanner leia = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("###.##");

		double num1 = 0, res;
		
		System.out.print("Digite o um numero: ");
		num1 = leia.nextDouble();	
		
		res = num1 % 2;
		
		if (num1 > 0) {
		
			if (res == 0) {
				
				System.out.println("\nO numero é par");
				res = Math.sqrt(num1);
				System.out.println("\nA raiz de " + num1 + " é " + df.format(res));
			}
			if (res != 0) {
				System.out.println("\nO numero é impar");
				res = Math.pow(num1, 2);
				System.out.println("\nO quadrado de " + num1 + " é " + res);
				
			}
		}
		else {
			System.out.println("Numero não é valido, tente novamente");
		}
	}
	
}

