package aula;

public class PessoaJuridica extends ImpostoDeRenda {
	
	// Atributos 
	
	private String cnpj;
	private String inscEstadual;
	
	// Construtor com herança;
	
	public PessoaJuridica(String nome, double rendimentos, String cnpj, String inscEstadual) {
		super(nome, rendimentos);
		this.cnpj = cnpj;
		this.inscEstadual = inscEstadual;
	}

	//Sobrescrição do método de calculo herdado da super classe;
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


