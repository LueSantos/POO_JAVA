package model;

public class Telefone {
	
	private String numero;
	


	public Telefone (String numero) {
		
		this.numero = numero;
	}
	
	public String getNumero() {
		return this.numero;
	}

	
	@Override
	public String toString() {
		return String.format("Telefone: %s ", this.numero);
	}
	
	
}
