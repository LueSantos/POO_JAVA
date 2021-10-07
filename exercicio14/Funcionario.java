package aula;

public class Funcionario {
	
	private String nome;
	private String cargo;
	private double salario;
	
	public Funcionario(String nome, String cargo, double salario) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	public double abonoSalarial(double abono) {
		return this.salario += abono;
	}
	
	
	@Override
	public  String toString() {
		return String.format("Nome: %s -  Cargo: %s - Salário: %.2f \n", this.nome, this.cargo, this.salario);
	}
	
	


}
