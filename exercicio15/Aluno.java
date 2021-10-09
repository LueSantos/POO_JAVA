package aula;

public class Aluno {
	
	private String nome;
	private double nota1;
	private double nota2;
	
	
	public Aluno( String nome, double nota1, double nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	
	}


	public String getNome() {
		return nome;	
	}


	public double getNota1() {
		return nota1;
	}


	public double getNota2() {
		return nota2;
	}
	
	
	public double CalcularMedia(double mediaFinal) {
		return this.nota1 + this.nota2 / 2.0;
		
	}
	
	
	@Override
	public String toString() {
		return String.format("Nome: %s  Nota1: %.2f - Nota2: %.2f - ", this.nome, this.nota1, this.nota2);
		
	}

	
	public double calculadoraMedia() throws AlunoException{
		double media = 0;
		return media;
		
	}
	
	public double calcularMedia() throws AlunoException{
		double media = 0;
		if (this.nota1 >10 || this.nota2 > 10) {
		    throw new AlunoException("Notas NÃO podem ser maiores que 10!");
		}		   
		if(this.nota1 < 0 || this.nota2 < 0) {
			throw new AlunoException("Notas NÃO podem ser menores que 0!");
		}
		else {
       		 media = (this.nota1 + this.nota2) / 2.0; 
    	}
    	return media;	
		}
	
}
