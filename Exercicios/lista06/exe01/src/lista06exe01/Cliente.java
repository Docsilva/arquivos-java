package lista06exe01;


public class Cliente {
	
	
	private String email;
	private String nome;
	private long telefone;
	private int cep;
	private float crediario;
	
	public Cliente(String email, String nome, int telefone, int cep, float crediario) {

		this.email = email;
		this.nome = nome;
		this.telefone = telefone;
		this.cep = cep;
		this.crediario = crediario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(int cpf) {
		this.email = email;
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
		System.out.println("\nCPF: " + this.email);
		System.out.println("\nCEP: " + this.cep);
		System.out.println("\nTelefone: " + this.telefone);
		System.out.println("\nValor disponivel p/ crédito: " + this.crediario);

	}

}




