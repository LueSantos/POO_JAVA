package aula;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Carro extends Veiculo implements Oficina {

	
	private String categoria;


	
	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
	}

 
	
	public String getCategoria() {
		return this.categoria;
	}
	
	@Override
	public double lavarVeiculo() {
		
		this.valorCobrado += TipoServico.LAVAGEM.getValorPorServico();
		return super.valorCobrado;
	}


	@Override
	public double trocarOleo() {
		
		this.valorCobrado += TipoServico.OLEO.getValorPorServico();
		
		if(dataConserto.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
			valorCobrado = valorCobrado + TipoServico.OLEO.getValorPorServico() - 50;
		}
			else { 
				valorCobrado = valorCobrado + TipoServico.OLEO.getValorPorServico();
			}
			return valorCobrado;
		}
		

	@Override
	public double revisao() {
		this.valorCobrado += TipoServico.REVISAO.getValorPorServico();
		
		if(dataConserto.getMonth().equals(Month.AUGUST)) {
			valorCobrado = valorCobrado -= valorCobrado * 0.1;
		}
		
		return valorCobrado;
	}
}
