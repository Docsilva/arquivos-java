package contabancaria.controller;

import java.util.ArrayList;

import contabancaria.model.Conta;
import contabancaria.repository.ContaRepository;

public class ContaController  implements ContaRepository {
	
	private ArrayList<Conta> listaContas = new ArrayList<Conta> ();

	@Override
	public void listarTodas() {

		for (var conta : listaContas) {
			conta.visualizar();
		}
	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
	}

	@Override
	public void atualizar(Conta conta) {
		var buscaConta = buscarNaCollection(conta.getNumero());
		
		if (buscaConta != null) {
			listaContas.set(listaContas.indexOf(buscaConta), conta);

		}else
			System.out.println("\nConta não encontrada!");

	}

	public void deletar(int numero) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null) {
			if (listaContas.remove(conta) == true);
				System.out.println("\nConta apagada");
		}
		else
			System.out.println("\nConta não encontrada!");
	}

	@Override
	public void sacar(int numero, float valor) {
		var buscaConta = buscarNaCollection(numero);
		
		if (buscaConta != null) {
			if (listaContas.get(listaContas.indexOf(buscaConta)).sacar(valor) == true);
			System.out.println("\nSaque Realizado! \nNovo saldo é: " + listaContas.get(listaContas.indexOf(buscaConta)).getSaldo());


		}else
			System.out.println("\nConta não encontrada!");

	}		

	@Override
	public void depositar(int numero, float valor) {
		var buscaConta = buscarNaCollection(numero);
		
		if (buscaConta != null) {
			listaContas.get(listaContas.indexOf(buscaConta)).depositar(valor);
			System.out.println("\nDeposito Realizado!");


		}else
			System.out.println("\nConta não encontrada!");		
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		
		//faz o mesmo processo do cód abaixo, sem mensagens de confirmacao
	/*	sacar(numeroOrigem, valor);
		depositar(numeroDestino, valor);
	*/	
		
		var buscaContaOrigem = buscarNaCollection(numeroOrigem);
		var buscaContaDestino = buscarNaCollection(numeroDestino);
		
		if (buscaContaOrigem != null && buscaContaDestino != null){
			if (buscaContaOrigem != null) {
				if (listaContas.get(listaContas.indexOf(buscaContaOrigem)).sacar(valor) == true) {
				listaContas.get(listaContas.indexOf(buscaContaDestino)).depositar(valor);
				System.out.println("\nTransferencia Realizado!");
				}
			}
			
		} else
			System.out.println("\nConta de origem e/ou destino não existem!");

	}

	@Override
	public void deletar(Conta numero) {
		// criado automatico (duplicado), sem uso
		
	}
	
	
	public int gerarNumeros() {
		return listaContas.size() + 1 ;
	}
	
	public Conta buscarNaCollection(int numero) {

		for (var conta : listaContas) {
			if (conta.getNumero() == numero)
				return conta;
		}
		return null;
	}


	@Override
	public void procurarPorNumero(int numero) {
		
		var conta = buscarNaCollection(numero);
		
		if (conta != null)
			conta.visualizar();
		else
			System.out.println("\nConta não encontrada!");
	}

	public int retornaTipo(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero);
				return conta.getTipo();
		}
		return 0;
	}

}
