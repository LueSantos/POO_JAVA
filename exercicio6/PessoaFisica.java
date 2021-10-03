package aula;

public class PessoaFisica extends ImpostoDeRenda {
	
	private String cpf;
	private String rg;
	
	public PessoaFisica(String nome, double rendimentos, String cpf, String rg) {
		super(nome, rendimentos);
		this.cpf = cpf;
		this.rg = rg;
	}


	
	@Override
	public String toString() {
		return String.format("Pessoa Fisica - nome: %s, rendimentos: %.2f, cpf: %s, rg: %s",
			this.nome, this.rendimentos, this.cpf, this.rg);
	}
}
	
	
