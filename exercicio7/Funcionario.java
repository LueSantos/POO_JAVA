package aula;

public class Funcionario {
	

	protected String nome;
	protected String cpf;
	protected String turno;
	protected double salario;
	

	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	
	
	@Override
	public String toString() {
		return String.format("Funcionario - nome: %s, Salario: %.2f", this.nome, this.salario );
		
	}

	public void calparticipacao() {
		this.salario += this.salario * 0.01;
	}
	
}
