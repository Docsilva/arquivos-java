package arraylist;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {


		Set<Double> notas = new HashSet<Double> ();
		
		notas.add(1.0);
		notas.add(2.0);
		notas.add(3.0);
		notas.add(4.0);
		notas.add(5.0);
		notas.add(6.0);
/*		notas.add(7.0);
		notas.add(8.0);
		notas.add(9.0);
		notas.add(10.0);
		notas.add(11.0);
		notas.add(12.0);
		notas.add(13.0);
		notas.add(14.0);
		notas.add(15.0);
		notas.add(16.0);
		notas.add(17.0);
		notas.add(18.0);
		notas.add(19.0);
		notas.add(20.0);
*/
		
		
		System.out.print("\nDados da Collection Notas: \n" + notas);
		
		System.out.println("\n\n\ncód gerado no sistema: \n"
);
		for(var nota : notas) {
			
		System.out.println(nota.hashCode() + "\n");
		}
		
		
		Iterator <Double> iNotas = notas.iterator();
		while(iNotas.hasNext()) {
			System.out.print("\n" + iNotas.next());
		}

	}
	
	

}
