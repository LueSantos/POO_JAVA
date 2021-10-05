package aula;

public enum TipoServico {
	
	OLEO (100.0), LAVAGEM (50.0), REVISAO (200.0);
	
	private double valorPorServico;


	private TipoServico(double valorPorServico) {
		this.valorPorServico = valorPorServico;
	}
	
	
	public double getValorPorServico() {
		return this.valorPorServico;
	}
}
