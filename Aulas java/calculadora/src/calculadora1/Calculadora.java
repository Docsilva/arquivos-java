package calculadora1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		

		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.##");
		
		int num1, num2;
		
		System.out.print("Digite o primeiro numero: ");
		num1 = leia.nextInt();		
		
		System.out.print("Digite o segundo numero: ");
		num2 = leia.nextInt();		
		
		System.out.println("\n" + num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println("\n" + num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println("\n" + num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println("\n" + num1 + " / " + num2 + " = " + (num1 / num2));
		System.out.println("\n" + num1 + " ˆ " + num2 + " = " + Math.pow(num1, num2));
		System.out.println("\nA raiz de " + num1 + " = " + df.format(Math.sqrt (num1)));

	}

}
