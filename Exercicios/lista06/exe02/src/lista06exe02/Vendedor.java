package lista06exe02;

public class Vendedor extends Funcionario { 
	
	String local_trab;

	public Vendedor(int id, int cart_trab, String area, String nome, int anos, String local_trab) {
		super(id, cart_trab, area, nome, anos);
		this.local_trab = local_trab;
	}

	public String getNum_func() {
		return local_trab;
	}

	public void setNum_func(String local_trab) {
		this.local_trab = local_trab;
	}

	public void vizualizar() {
		super.vizualizar();
		System.out.print("\nLocal de trabalho: \n" + this.local_trab);

	}
}
