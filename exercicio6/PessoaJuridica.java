package aula;

public class PessoaJuridica extends ImpostoDeRenda {
	
	private String cnpj;
	private String inscEstadual;
	
	public PessoaJuridica(String nome, double rendimentos, String cnpj, String inscEstadual) {
		super(nome, rendimentos);
		this.cnpj = cnpj;
		this.inscEstadual = inscEstadual;
	}


	@Override
	public void calculoIR() {
		this.rendimentos = this.rendimentos - (this.rendimentos * 0.15);
	}
	
		@Override
		public String toString() {
			return String.format("Pessoa Juridica - nome: %s, rendimentos: %.2f, cnpj: %s, inscEstadual: %s",
				this.nome, this.rendimentos, this.cnpj, this.inscEstadual);
		}
		
}		


