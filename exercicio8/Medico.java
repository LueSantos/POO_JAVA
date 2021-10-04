package aula;

public class Medico extends Plano {
	
	
	protected String nome; 
	private int crm;
	
	
	public Medico(String empresa, String nome, int crm) {
		super(empresa);
		this.nome = nome;
		this.crm = crm;
	}


	public String getNome() {
		return this.nome;
	}


	public int getCrm() {
		return this.crm;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Médico: " + this.nome + this.crm;
	}

	
	@Override
	public double calcularPagamento() {
		return this.valorPago = super.calcularPagamento() + (this.valorPago * 0.1);
		
	}
	

}
