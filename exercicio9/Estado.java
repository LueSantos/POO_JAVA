package model;

public class Estado {
	
	private String nomeEstado; 
	
	private String sigla;
	
	

	public Estado(String nomeEstado, String sigla) {
		this.nomeEstado = nomeEstado;
		this.sigla = sigla;
	}

	public String getNomeEstado() {
		return this.nomeEstado;
	}

	public String getSigla() {
		return this.sigla;
	}
	
	@Override
	public String toString() {
		return String.format("Estado:" + this.nomeEstado + "UF:" + this.sigla);
	}
	

}
