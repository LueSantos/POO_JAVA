package aula;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina{
	
	
	protected String modelo;
	protected double valorCobrado;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;
	
	
	public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
		super();
		this.modelo = modelo;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}
	
	
	public double getValorCobrado() {
		return this.valorCobrado;
		
	}
	
	@Override
	public String toString() {
		return String.format( this.modelo + this.valorCobrado);
	}


	
}
