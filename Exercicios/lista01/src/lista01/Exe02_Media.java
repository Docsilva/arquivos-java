package lista01;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exe02_Media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		double not1, not2, not3, not4;


		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.#");
		
		System.out.print("Informe a primeira nota: ");
		not1 = leia.nextDouble();
		
		System.out.print("Informe a segunda nota: ");
		not2 = leia.nextDouble();
		
		System.out.print("Informe a terceira nota: ");
		not3 = leia.nextDouble();
		
		System.out.print("Informe a quarta nota: ");
		not4 = leia.nextDouble();
		
		System.out.println("A média do aluno é: " + df.format((not1 + not2 + not3 + not4)/4));

	}

}
