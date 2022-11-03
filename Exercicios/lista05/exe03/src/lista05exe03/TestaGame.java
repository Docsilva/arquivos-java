package lista05exe03;

//import lista05exe02.Game;

public class TestaGame {

	public static void main(String[] args) {


		Game game1 = new Game (0001, 2021, "Azul", "Controle PS5", "Playstation");
		Game game2 = new Game (0002, 2022, "Verde", "Jogo Midia Fisica", "X-Box");

		
		game1.vizualizar();
		System.out.println("\n------------------------------------------------------\n");
		game2.vizualizar();
	}

}
