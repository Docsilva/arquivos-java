package lista05exe02;

public class Funcionario {
	
	private int id;
	private int cart_trab;
	private int anos;
	private String cargo;
	private String nome;
	
	public Funcionario(int id, int cart_trab, String cargo, String nome, int anos) {
		
		this.id = id;
		this.cart_trab = cart_trab;
		this.anos = anos;
		this.cargo = cargo;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCart_trab() {
		return cart_trab;
	}

	public void setCart_trab(int cart_trab) {
		this.cart_trab = cart_trab;
	}

	public long getAnos() {
		return anos;
	}

	public void setAnos(int anos) {
		this.anos = anos;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void vizualizar() {
		System.out.println("*************************************\n");
		System.out.println("Dados do Funcionario");
		System.out.println("\n*************************************");
		System.out.println("\nCód de identificação: " + this.id);
		System.out.println("\nNome do trabalhador: " + this.nome);
		System.out.println("\nCargo atual:  " + this.cargo);
		System.out.println("\nN. Carteira de Trabalho: " + this.cart_trab);
		System.out.println("\nTempo de Trabalho: " + this.anos + " Anos");

	}


}
