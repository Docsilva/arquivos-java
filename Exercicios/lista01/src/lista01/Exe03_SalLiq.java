package lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe03_SalLiq {

	public static void main(String[] args) {


		double sal_bru, adc_not, hor_ext, des;


		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.##");
		
		System.out.print("Informe o salário bruto: ");
		sal_bru = leia.nextDouble();
		
		System.out.print("Informe o adcional noturno: ");
		adc_not = leia.nextDouble();
		
		System.out.print("Informe o total de horas extras: ");
		hor_ext = leia.nextDouble();
		
		System.out.print("Informe o toral de descontos: ");
		des = leia.nextDouble();
		
		System.out.println("O salario liquido é de R$: " + df.format(((sal_bru + adc_not + (hor_ext*5)) - des)));
	}

}
