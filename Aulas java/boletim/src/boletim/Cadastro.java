package boletim;

import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {

		Scanner read = new Scanner( System . in );
		String sigla ;

		System.out.print("Insira a sigla do seu Estado: ");
		sigla = read. nextLine();

		switch ( sigla.toUpperCase()) {
		case "SP":
			System.out.print("Você é de São Paulo");
		break ;

		case "BA" :
			System.out.print("Você é da Bahia" );
		break ;

		case "RS" :
			System.out.print("Você é do Rio Grande do Sul");
		break ;

		default :
			System.out.print("Siga não reconhecida" );
		}

		/* CHOICE(CONDITIONAL){
		* CASE:
		* message
		*TO STOP;
		*
		*OTHERWISE
		* message
		* }
		*
		* */

		}

		}