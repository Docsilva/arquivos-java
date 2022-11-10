package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	public static Scanner leia = new Scanner (System.in);
	public static void main(String[] args) {
		


		
		ArrayList <Double> notas = new ArrayList <Double>();
		
		Double d = Double.valueOf(9);
		
		double numero = 0.0;
		
		notas.add(7.0);
		notas.add(5.0);
		notas.add(3.0);
		notas.add(4.0);
		notas.add(10.0);
		notas.add(d);
		
		
		
		System.out.println("\nEntre com a ultima nota: ");
		numero = leia.nextDouble();
		notas.add(numero);

		System.out.println("\nDados da Collection Notas: " + notas.toString());
		
		System.out.println("\nPosicao da nota 4: " + notas.indexOf(4.0));

		System.out.println("\nPExiste a nota 4: " + notas.contains(4.0));
		
	//	notas.remove(4.0);

		System.out.println("\nPosicao da nota 4: " + notas.indexOf(4.0));

		System.out.println("\nPExiste a nota 4: " + notas.contains(4.0));
		
		System.out.println("\nSe lista esta vazia: " + notas.isEmpty());
		

		
	}

}
