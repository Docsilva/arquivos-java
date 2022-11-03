package lista05exe03;

public class Game {
	
	private int id;
	private int ano;
	private String cor;
	private String nome;
	private String plataforma;
	public Game(int id, int ano, String cor, String nome, String plataforma) {

		this.id = id;
		this.ano = ano;
		this.cor = cor;
		this.nome = nome;
		this.plataforma = plataforma;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	
	public void vizualizar() {
		System.out.println("*************************************\n");
		System.out.println("Loja Games");
		System.out.println("\n*************************************");
		System.out.println("\nCód de identificação: " + this.id);
		System.out.println("\nNome do produro: " + this.nome);
		System.out.println("\nAno de lançamento:  " + this.ano);
		System.out.println("\nN. Plataforma: " + this.plataforma);
		System.out.println("\nCor predominante: " + this.cor);

	}
	

}
