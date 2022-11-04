package lista06exe02;

//import lista05exe02.Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {


		Funcionario trab1 = new Funcionario (0001, 1488, "Gerente", "Mariazinha", 03);
		Funcionario trab2 = new Funcionario (0002, 3425, "Estoquista", "Irineu", 15);
		
		Vendedor trab3 = new Vendedor (0002, 3425, "Projeos", "Irineu", 15, "Loja ABC");
		Gerente trab4 = new Gerente (0002, 3425, "Frente de loja", "Irineu", 12, 8);


		
		trab1.vizualizar();
		System.out.println("\n------------------------------------------------------\n");
		trab2.vizualizar();
		System.out.println("\n------------------------------------------------------\n");
		trab3.vizualizar();
		System.out.println("\n------------------------------------------------------\n");
		trab4.vizualizar();
	}

}
