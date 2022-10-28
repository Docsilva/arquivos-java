package boletim;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Boletim {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		
		double not1, not2, med;
		boolean res;



		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.##");
		
		System.out.print("Digite a primeira nota: ");
		not1 = leia.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		not2 = leia.nextDouble();
		
		med = (not1 + not2) / 2;
		
		res = med >= 7;
		
		
		if (res == true) {
			System.out.println("\nA media é superior a 7.0");
		}
		
		else {
			System.out.println("\nA media é inferior a 7.0");
		} 
		
		
	}

}
