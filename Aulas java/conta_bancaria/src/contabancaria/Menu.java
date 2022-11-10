package contabancaria;

import java.io.IOException;
import java.util.Scanner;

import contabancaria.controller.ContaController;
import contabancaria.model.Conta;
import contabancaria.model.ContaCorrente;
import contabancaria.model.ContaPoupanca;
import contabancaria.util.Cores;

public class Menu {
	
	
	public static Scanner leia = new Scanner (System.in);
	public static void main(String[] args) {
		

		int op, agencia, tipo, data, numero = 0, numeroDestino, numeroOrigem;
		float saldo, limite, valor;
		String titular;

		ContaController contas = new ContaController();
		
		
		
/*		ContaCorrente cc1 = new ContaCorrente(0, 123, 1, "João", 1000.0f, 100.0f);
		contas.cadastrar(cc1);
		contas.listarTodas();
		
		ContaPoupanca cp1 = new ContaPoupanca(0, 123, 1, "Andre", 1500.0f, 10);
		contas.cadastrar(cp1);
		contas.listarTodas();
*/		
		
		
		while  (true){
		
			System.out.println(Cores.TEXT_CYAN + Cores.ANSI_BLACK_BACKGROUND + " +++++++++++++++++++++++++++++++++++++++++");
			System.out.println(" +                                       +");
			System.out.println(" +           Banco do Brazil             +");
			System.out.println(" +                                       +");
			System.out.println(" + ------------------------------------- +");
			System.out.println(" +                                       +");
			System.out.println(" +           1 - Criar Conta             +");
			System.out.println(" +           2 - Listar todas as contas  +");
			System.out.println(" +           3 - Buscar conta por numero +");
			System.out.println(" +           4 - Atualizar dados         +");
			System.out.println(" +           5 - Apagar	                 +");
			System.out.println(" +           6 - Sacar                   +");
			System.out.println(" +           7 - Deposita                +");
			System.out.println(" +           8 - Transferir              +");
			System.out.println(" +           9 - Sair                    +");
			System.out.println(" +                                       +");
			System.out.println(" +++++++++++++++++++++++++++++++++++++++++" + Cores.TEXT_RESET);
			System.out.print("\nEntre com a opção: ");
			op = leia.nextInt();
			
			if (op == 9) {
				
				System.out.println("Fim do programa!");
				leia.close();
				System.exit(0);
			}
			
			switch (op) {
			
			case 1: 
				System.out.println("\nCriar Conta\n");
				System.out.println("\nDigite a agencia: ");
				agencia = leia.nextInt();
				System.out.println("\nNome do titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();
				System.out.println("\nDigite o Saldo da Conta: ");
				saldo = leia.nextFloat();
				
				System.out.println("\nTipo de conta: (1-CC ou 2-CP");
				tipo = leia.nextInt();
				
				switch (tipo) {
				
					case 1 -> {
						System.out.println("\nLimite: ");
						limite = leia.nextFloat();
						contas.cadastrar(new ContaCorrente(contas.gerarNumeros(), agencia, tipo, titular, saldo, limite));

	
					}
					
					case 2 -> {
						System.out.println("\nData de ANIVERSARIO");
						data = leia.nextInt();
						contas.cadastrar(new ContaPoupanca(contas.gerarNumeros(), agencia, tipo, titular, saldo, data));
					}
				}
				
				keyPress();
				break;
				
			case 2: 
				System.out.println("\nListar contas");
				contas.listarTodas();
				
				keyPress();
				break;
				
			case 3: 
				System.out.println("\nBuscar conta por numero");
				System.out.println("\nEntre com numero");
				numero = leia.nextInt();
				
				contas.procurarPorNumero(numero);
				
				keyPress();
				break;
				
			case 4: 
				System.out.println("\nAtualizar dados\n");
				System.out.println("\nEntre com numero da conta");
				numero = leia.nextInt();
				
				if (contas.buscarNaCollection(numero) != null) {
					
				System.out.println("\nDigite a agencia: ");
				agencia = leia.nextInt();
				System.out.println("\nNome do titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();
				System.out.println("\nDigite o Saldo da Conta: ");
				saldo = leia.nextFloat();
		
				tipo = contas.retornaTipo(numero);
				switch (tipo) {
				
					case 1 -> {
						System.out.println("\nLimite: ");
						limite = leia.nextFloat();
						contas.atualizar(new ContaCorrente(numero, agencia, tipo, titular, saldo, limite));
						System.out.println("\n\nConta atualizada!");

	
					}
					
					case 2 -> {
						System.out.println("\nData de ANIVERSARIO");
						data = leia.nextInt();
						contas.atualizar(new ContaPoupanca(numero, agencia, tipo, titular, saldo, data));
						System.out.println("\n\nConta atualizada!");

					}
				}
				} else
					System.out.println("\nConta não encontrada");
				
				keyPress();
				break;
				
			case 5: 
				System.out.println("\nDeletar");
				System.out.println("\nEntre com numero da conta");
				numero = leia.nextInt();
				
				contas.deletar(numero);
				
				keyPress();
				break;
				
			case 6: 
				System.out.println("\nSacar");
				System.out.println("\nEntre com numero da conta");
				numero = leia.nextInt();
				System.out.println("\nDigite o valor do saque: ");
				valor = leia.nextFloat();
				
				contas.sacar(numero, valor);
								
				keyPress();
				break;
				
			case 7: 
				System.out.println("\nDepositar");
				System.out.println("\nEntre com numero da conta");
				numero = leia.nextInt();
				System.out.println("\nDigite o valor do deposito: ");
				valor = leia.nextFloat();
				
				contas.depositar(numero, valor);
				
				keyPress();
				break;
				
			case 8: 
				System.out.println("\nTransferir");
				System.out.println("\nEntre com numero da conta de Origem");
				numeroOrigem = leia.nextInt();
				System.out.println("\nEntre com numero da conta de destino");
				numeroDestino = leia.nextInt();
				System.out.println("\nDigite o valor do deposito: ");
				valor = leia.nextFloat();
				
				contas.transferir(numero, numeroDestino, valor);
				
				
				keyPress();
				break;
			}
			
		}
				
	}

	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}

	
	
}
