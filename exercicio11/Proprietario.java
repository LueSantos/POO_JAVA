package aula;

public class Proprietario {
	
	private String nome;

	public Proprietario(String nome) {
		this.nome = nome;
	}
	
	
	public String getNome() {
		return this.nome;
			
	}
		
	
	@Override 
	public String toString() {
		return String.format( this.getNome());
	}

}
