package lista06exe03;

public class Console extends Game {
	
	String marca;

	public Console(int id, int ano, String cor, String nome, String plataforma, String condicao) {
		super(id, ano, cor, nome, plataforma);
		this.marca = condicao;
	}

	public String getCondicao() {
		return marca;
	}

	public void setCondicao(String condicao) {
		this.marca = condicao;
	}
	
	public void vizualizar() {
		super.vizualizar();
		System.out.print("\nFabricante: \n" + this.marca);

	}

}
