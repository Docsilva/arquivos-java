package lista06exe03;

//import lista05exe02.Game;

public class TestaGame {

	public static void main(String[] args) {


		Game game1 = new Game (0001, 2021, "Azul", "Controle PS5", "Playstation");
		Game game2 = new Game (0002, 2021, "Verde", "HALO", "X-Box");
		
		Jogo game3 = new Jogo (0003, 2020, "Verde", "FORZA", "X-Box", "USADO");
		Console game4 = new Console (0004, 2022, "AZUL", "PS5", "PS5", "SONY");


		
		game1.vizualizar();
		System.out.println("\n------------------------------------------------------\n");
		game2.vizualizar();
		System.out.println("\n------------------------------------------------------\n");
		game3.vizualizar();
		System.out.println("\n------------------------------------------------------\n");
		game4.vizualizar();
	}

}
