package aula;

public class App {

	public static void main(String[] args) {

		Gerente Ger = new Gerente("Paula", 12000.00);
		Assistente Asst = new Assistente("Luciana", 4200.00, 2420.00);
		
		calparticipacao(Ger);
		calparticipacao(Asst);
		
	}
		
		public static void calparticipacao(Funcionario funcionario) {
			funcionario.calparticipacao();
		System.out.println(funcionario.toString());
		

	}

}
