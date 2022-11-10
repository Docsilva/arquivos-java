package contabancaria.model;

public class ContaCorrente extends Conta{		
	
	private float limite;
	
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite;
		
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public void vizualizar() {
		super.visualizar();
		System.out.println("\nLimite de crédito: \n" + this.limite);
		
	}
	
	public boolean sacar (float valor) {
		if (getSaldo() + this.limite < valor) {
			System.out.println("Saldo insuficiente");
			return true;
		}
		
		this.setSaldo(getSaldo() - valor);
		return true;
	}

}
