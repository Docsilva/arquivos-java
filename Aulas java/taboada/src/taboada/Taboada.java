package taboada;

import java.util.Scanner;

public class Taboada {

	public static void main(String[] args) {


		Scanner leia = new Scanner (System.in);

		int num;
		boolean ok = false;
		
		do {
				System.out.print("Digite o valor: ");
				num = leia.nextInt();
				System.out.print(" \n");
				
				if (num < 1 || num > 10) {
					System.out.println("\nDigite um numero entre 1 e 10");
				}else
					ok = true;
						
		}while (ok == false);
			
		for (int i = 0; i <= 10; i++) {
				
			System.out.println(num + " X " + i + " = " + (num * i));
		}

		
		/*int num, i = 0;
		
		System.out.print("Digite o valor: ");
		num = leia.nextInt();
		
		while (i <= 10 ) {
			System.out.println(num + " X " + i + " = " + (num * i));
			i ++;
		}*/
	}

}
