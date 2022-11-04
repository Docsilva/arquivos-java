package lista06exe03;

public class Jogo extends Game {
	
	String condicao;

	public Jogo(int id, int ano, String cor, String nome, String plataforma, String condicao) {
		super(id, ano, cor, nome, plataforma);
		this.condicao = condicao;
	}

	public String getCondicao() {
		return condicao;
	}

	public void setCondicao(String condicao) {
		this.condicao = condicao;
	}
	
	public void vizualizar() {
		super.vizualizar();
		System.out.print("\nCondição do jogo: \n" + this.condicao);

	}

}
