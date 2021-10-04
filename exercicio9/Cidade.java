package model;

public class Cidade {
	
	// Ordem para escrever um code considerado como boa prática --> Atributos, set/get, constructor; metodos. 
	
	private String nomeCidade;
	private Estado estado;




	public String getNomeCidade() {
		return nomeCidade;
	}


	public Estado getEstado() {
		return this.estado;	
	}
	


	
	
	public Cidade(String nomeCidade, Estado estado) {
		this.nomeCidade = nomeCidade;
		this.estado = estado;
	}


	@Override
	public String toString() {
		return String.format(" %s %s", this.nomeCidade, this.estado);
	}
	
}
