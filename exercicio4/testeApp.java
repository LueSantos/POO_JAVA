package exercicioUm;

public class testeApp {

	public static void main(String[] args) {
// METODO COM PARAMETRO : Pode receber um ou mais parametros, que sao informações 
// que o metodo irá processar para retornar um resultado ao programa.
		
			
			Empregado empregado1 = new Empregado("Luciana ", "Santos", 10230.00);
			Empregado empregado2 = new Empregado("Humberto ", "Ferreira", 2520.00);
			
			
			double salario1 = empregado1.CalcularImpostoRenda(empregado1.getSalario());
				empregado1.setSalario(salario1);
				
			double salario2 = empregado2.CalcularImpostoRenda(empregado2.getSalario());
				empregado2.setSalario(salario2);
				
			empregado1.imprimirEmpregado();
			empregado2.imprimirEmpregado();
		}
		
		
	}
		
		
		
		
		
		
		
		/*
		// referenciando o processo do desconto do salario
		empregado1.salarioDescontado();
		empregado2.salarioDescontado();
		
		
		
		// Calcular IR
		
		empregado1.CalcularImpostoRenda(empregado1.getSalario());
		empregado2.CalcularImpostoRenda(empregado2.getSalario());
		
		double salario = empregado1.CalcularImpostoRenda(empregado1.getSalario());
*/
	

