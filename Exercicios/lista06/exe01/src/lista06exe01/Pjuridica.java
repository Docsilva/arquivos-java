package lista06exe01;

public class Pjuridica extends Cliente {
	
	String cnpj;

	public Pjuridica(String email, String nome, int telefone, int cep, float crediario, String cnpj) {
		super(email, nome, telefone, cep, crediario);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void vizualizar() {
		super.vizualizar();
		System.out.print("\nCNPJ: \n" + this.cnpj);

	}
}
