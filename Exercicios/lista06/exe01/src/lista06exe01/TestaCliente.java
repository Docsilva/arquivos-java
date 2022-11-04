package lista06exe01;



public class TestaCliente {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("joaozinho@email.com", "Joaozinho", 91234567, 03111111, 5000.0f);
		Cliente c2 = new Cliente("mariazinha@email.com", "Mariazinha", 97654321, 03222333, 3500.0f);
		
		Pfisica c3 = new Pfisica("mariazinha@email.com", "Mariazinha", 97654321, 03222333, 3500.0f, "363063760");
		Pjuridica c4 = new Pjuridica("mariazinha@email.com", "Mariazinha", 97654321, 03222333, 3500.0f, "1212312300");

		
		c1.vizualizar();
		System.out.println("\n------------------------------------------------------\n");
		c2.vizualizar();
		System.out.println("\n------------------------------------------------------\n");
		c3.vizualizar();
		System.out.println("\n------------------------------------------------------\n");
		c4.vizualizar();
		

	}

}
