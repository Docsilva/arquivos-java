package contabancaria;

import java.util.Scanner;

import contabancaria.model.Conta;
import contabancaria.model.ContaCorrente;
import contabancaria.model.ContaPoupanca;
import contabancaria.util.Cores;

public class Menu {
	
	
	public static Scanner leia = new Scanner (System.in);
	public static void main(String[] args) {

		int op;

		ContaCorrente c1 = new ContaCorrente(1, 123, 2, "João da Silva", 10000.0f, 1000.0f);
		ContaPoupanca cp1 = new ContaPoupanca (2, 123, 2, "Maria da Silva", 10000.0f, 15);

		
		c1.vizualizar();
		
		cp1.vizualizar();
		
		/*7		c1.sacar(1500.0f);
		
		c1.vizualizar(); 
		
		
		while  (true){
		
			System.out.println(Cores.TEXT_CYAN + Cores.ANSI_BLACK_BACKGROUND + " +++++++++++++++++++++++++++++++++++++++++");
			System.out.println(" +                                       +");
			System.out.println(" +           Banco do Brazil             +");
			System.out.println(" +                                       +");
			System.out.println(" + ------------------------------------- +");
			System.out.println(" +                                       +");
			System.out.println(" +           1 - Criar Conta             +");
			System.out.println(" +           2 - Ver Saldo               +");
			System.out.println(" +           3 - Dados Conta             +");
			System.out.println(" +           4 - Sacar                   +");
			System.out.println(" +           5 - Depositar               +");
			System.out.println(" +           6 - Transferir              +");
			System.out.println(" +           7 - Sair                    +");
			System.out.println(" +                                       +");
			System.out.println(" +++++++++++++++++++++++++++++++++++++++++" + Cores.TEXT_RESET);
			System.out.print("\nEntre com a opção: ");
			op = leia.nextInt();
			
			if (op == 7) {
				
				System.out.println("Fim do programa!");
				leia.close();
				System.exit(0);
			}
			
			switch (op) {
			
			case 1: 
				System.out.println("\nCriar Conta");
				
				break;
				
			case 2: 
				System.out.println("\nVer Saldo");
				
				break;
			case 3: 
				System.out.println("\nDados da Conta");
				
				break;
				
			case 4: 
				System.out.println("\nSacae");
				
				break;
			case 5: 
				System.out.println("\nDepositar");
				
				break;
				
			case 6: 
				System.out.println("\nTransferir");
				
				break;
			}
		} */
				
	}

}
