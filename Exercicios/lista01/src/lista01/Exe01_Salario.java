package lista01;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exe01_Salario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double sal, abn;


		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.##");
		
		System.out.print("Informe o seu salário: ");
		sal = leia.nextDouble();
		
		System.out.print("Informe o valor do abono: ");
		abn = leia.nextDouble();
		
		System.out.println("O novo valor do salário com o abono é de R$ " + df.format(sal + abn));

	}

}
