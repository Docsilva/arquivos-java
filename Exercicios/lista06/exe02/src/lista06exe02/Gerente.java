package lista06exe02;

public class Gerente  extends Funcionario{
	
	int num_func;

	public Gerente(int id, int cart_trab, String area, String nome, int anos, int num_func) {
		super(id, cart_trab, area, nome, anos);
		this.num_func = num_func;
	}

	public int getLocal_trab() {
		return num_func;
	}

	public void setLocal_trab(int num_func) {
		this.num_func = num_func;
	}
	
	public void vizualizar() {
		super.vizualizar();
		System.out.print("\nTamanho de equipe: \n" + this.num_func);

	}
	
	


}
