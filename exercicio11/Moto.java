package aula;

import java.time.LocalDate;

public class Moto extends Veiculo implements Oficina{
	
	private int cilindradas;

	
	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, int cilindradas) {
		super(modelo, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}

	
	@Override
	public double lavarVeiculo() {
		valorCobrado += valorCobrado + TipoServico.LAVAGEM.getValorPorServico();
		return valorCobrado;
	}


	@Override
	public double trocarOleo() {

		valorCobrado += valorCobrado + TipoServico.OLEO.getValorPorServico();
		return valorCobrado;
	}


	@Override
	public double revisao() {

		valorCobrado += valorCobrado + TipoServico.REVISAO.getValorPorServico();
		return valorCobrado;
	}
	
	
}
