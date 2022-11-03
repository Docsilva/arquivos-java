package lista05exe01.model;

//import cliente.model.Conta;

public class Cliente {
	
	private long cpf;
	private String nome;
	private long telefone;
	private int cep;
	private float crediario;
	
	public Cliente(int cpf, String nome, int telefone, int cep, float crediario) {

		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.cep = cep;
		this.crediario = crediario;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public float getCrediario() {
		return crediario;
	}

	public void setCrediario(float crediario) {
		this.crediario = crediario;
	}
	
	public void vizualizar() {
		System.out.println("***************************************\n");
		System.out.println("********** Dados da Conta *************");
		System.out.println("\n***************************************");
		System.out.println("\nNome do Cliente: " + this.nome);
		System.out.println("\nCPF: " + this.cpf);
		System.out.println("\nCEP: " + this.cep);
		System.out.println("\nTelefone: " + this.telefone);
		System.out.println("\nValor disponivel p/ crédito: " + this.crediario);

	}

}




