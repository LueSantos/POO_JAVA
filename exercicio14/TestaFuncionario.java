package aula;

public class TestaFuncionario {

	
	public static void main(String[] args) {
		

		Funcionario[] fun = new Funcionario[3];
		
		
		fun[0] = new Funcionario(null, null, 0);
		
		fun[0].setNome("Henrique"); 
		fun[0].setCargo("Analista de Sistemas"); 
		fun[0].setSalario(2350); 
	
	

		fun[1] = new Funcionario(null, null, 0);
		
		fun[1].setNome("Sarah Lix"); 
		fun[1].setCargo("Analista de Sistemas"); 
		fun[1].setSalario(4200); 
	

	
		for (Funcionario funcionarios : fun) {
			double abonoSalario = 420;
			
			System.out.println(funcionarios + "Abono Salarial: " + abonoSalario);
	
			
		}
		
	
	}

}

