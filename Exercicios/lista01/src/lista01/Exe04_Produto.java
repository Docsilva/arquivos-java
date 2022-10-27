package lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe04_Produto {

	public static void main(String[] args) {


		int num1, num2, num3, num4;


		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.##");
		
		System.out.print("Digite o primeiro numero: ");
		num1 = leia.nextInt();		
		
		System.out.print("Digite o segundo numero: ");
		num2 = leia.nextInt();	
		
		System.out.print("Digite o terceiro numero: ");
		num3 = leia.nextInt();		
		
		System.out.print("Digite o quarto numero: ");
		num4 = leia.nextInt();	
		
		System.out.println("A diferença do produto entre os numeros digitados é de: " + (num1 * num2 - num3 *num4));

	}

}
