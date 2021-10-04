package aula;

public class Anestesista extends Medico {
	
	private String tipoAnestesista;

	public Anestesista(String empresa, String nome, int crm, String tipoAnestesista) {
		super(empresa, nome, crm);
		this.tipoAnestesista = tipoAnestesista;
	}

	public String getTipoAnestesista() {
		return tipoAnestesista;
	}

	public void setTipoAnestesista(String tipoAnestesista) {
		this.tipoAnestesista = tipoAnestesista;
	}

	
	@Override 

	public double calcularPagamento() {
		return this.valorPago = super.calcularPagamento() + 1000;		
	}
	
	@Override
	public String toString() {
		return super.toString() + " - Anestesista: " + this.tipoAnestesista;
	}
}


