package aula;

public class TestaIr {

	public static void main(String[] args) {

		// Instâncias das classes;
		
		PessoaFisica PF = new PessoaFisica("Luciana Santos", 420.000, "654890772-31", "34521");
		PessoaJuridica PJ = new PessoaJuridica("LarxShoes", 120.000, "548907/0001-43", "3452156-2");

		// Chamada do método de para calcular IR; 
		
		PF.calculoIR();
		PJ.calculoIR();
		
		// Impressão dos objetos formataados --> toString; 
		
		System.out.println(PF);
		System.out.println(PJ);
	}

}
