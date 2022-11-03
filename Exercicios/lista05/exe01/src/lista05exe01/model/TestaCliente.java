package lista05exe01.model;

public class TestaCliente {

	public static void main(String[] args) {

		Cliente c1 = new Cliente(1234567890, "Joaozinho", 91234567, 03111111, 5000.0f);
		Cliente c2 = new Cliente(1233211231, "Joaozinho", 97654321, 03111111, 5000.0f);

		
		c1.vizualizar();
		System.out.println("\n------------------------------------------------------\n");
		c2.vizualizar();
		
		

	}

}
