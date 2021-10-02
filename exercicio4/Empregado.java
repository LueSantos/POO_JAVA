package exercicioUm;

public class Empregado {
	
	
	private String nome;
	private String sobrenome; 
	private double salario; 

	
	
	// Constructor 
	
	public Empregado(String nome, String sobrenome, double salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
	}

	
	
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return this.sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double CalcularImpostoRenda(double valor) {
		if (valor <= 1903.98) {
			
		}else if (valor >= 1903.98 && valor < 2826.65) {
				valor = valor - (valor * 0.075);
				
		} else if (valor >= 2826.65 && valor <3751.05) {
			valor = valor - (valor * 0.15);
		
		} else if (valor >= 3751.05 && valor < 4664.68) {
			valor = valor - (valor * 0.225);
		
		} else if(valor > 4664.68) {
			valor = valor - (valor * 0.275);
		}
		
		return valor; 
	}
	
	
	public void imprimirEmpregado() {
		
		
		System.out.printf("\nEmpregado: %s %s", getNome(), getSobrenome());
		System.out.printf(" \nSalário: %s ", getSalario());
		
		
	}
	
}

