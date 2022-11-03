package lista05exe02;

//import lista05exe02.Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {


		Funcionario trab1 = new Funcionario (0001, 1488, "Gerente", "Mariazinha", 03);
		Funcionario trab2 = new Funcionario (0002, 3425, "Estoquista", "Irineu", 15);

		
		trab1.vizualizar();
		System.out.println("\n------------------------------------------------------\n");
		trab2.vizualizar();
	}

}
