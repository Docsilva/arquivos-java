
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
	
	
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);


		
		int dividendo = 0;
		int divisor = 0;
		boolean loop = true;
		
		do {
			try {
				
			System.out.print("Digite o Dividendo: ");
			dividendo = ler.nextInt();
					
			System.out.print("Digite o Divisor: ");
			divisor = ler.nextInt();
					
			divide(dividendo, divisor);
			
			loop = false;
			
			} catch (InputMismatchException  e) {
				System.out.println("\nExceção: " + e);
				ler.nextLine();
				System.out.println("\nDigite um numero inteiro: ");
				
			} catch (ArithmeticException  e) {
				System.out.println("\nExceção: " + e);
				ler.nextLine();
				System.out.println("\nDigite um numero inteiro positivo: ");
			} /* finally {
				System.out.println("\nExecute o bloco Finally");
			} */
		
		}while (loop);
	}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));

	}
}

