package aula;

public class Gerente extends Funcionario {
	
	private String nivel;

	
	public Gerente(String nome, double salario) {
		super(nome, salario);
		
	}
	


	public String getNivel() {
		return nivel;
	}



	public void setNivel(String nivel) {
		this.nivel = nivel;
	}



	@Override
	public void calparticipacao() {
		super.calparticipacao();
		this.salario += 200.00;
	
	}

}
