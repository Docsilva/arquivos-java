package lista06exe01;

public class Pfisica  extends Cliente {
	
	String cpf;
	
	public Pfisica(String email, String nome, int telefone, int cep, float crediario, String cpf) {
		super(email, nome, telefone, cep, crediario);
		this.cpf = cpf;
		
	}
	
	
	
	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public void vizualizar() {
		super.vizualizar();
		System.out.print("\nCPF: \n" + this.cpf);

	}

}