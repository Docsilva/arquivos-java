package contabancaria.repository;

import contabancaria.model.Conta;

public interface ContaRepositoty {
	
	public void procurarPorNumero (int numero);
	public void listarTodas();
	public void cadastrar (Conta conta);
	public void atualizar (Conta conta);
	public void deletar (Conta numero);
	
	public void sacar (int numero, float valor);
	public void depositar (int numero, float valor);
	public void transferir (int numeroOrigem, int numeroDestino, float valor);

}
