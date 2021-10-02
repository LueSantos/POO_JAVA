package aulas;

public class medico {
	
	String crm;
	String nome;
	double salario;
	double valorConsulta;
	static int totalMedico = 0;
	
	public  medico() {
		totalMedico ++;

	};
	
	public medico(String crm, String nome, double salario, double valorConsulta) {
		super();
		this.crm = crm;
		this.nome = nome;
		this.salario = salario;
		this.valorConsulta = valorConsulta;
		totalMedico ++;
	}

	public void pagamentoDinheiro(){
		this.salario = this.valorConsulta;
		System.out.println();
		
	}
	
public void pagamentoPlano(){
		
	this.salario = this.valorConsulta * 0.7;
	System.out.println();

}

}
	
