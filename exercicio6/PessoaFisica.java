package aula;

public class PessoaFisica extends ImpostoDeRenda {
	
	// Atributos 
	
	private String cpf;
	private String rg;
	
	// Constructor com herança;
	public PessoaFisica(String nome, double rendimentos, String cpf, String rg) {
		super(nome, rendimentos);
		this.cpf = cpf;
		this.rg = rg;
	}

	// Sobrescrição de método formatado do objeto;
	@Override
	public String toString() {
		return String.format("Pessoa Fisica - nome: %s, rendimentos: %.2f, cpf: %s, rg: %s",
			this.nome, this.rendimentos, this.cpf, this.rg);
	}
}
	
	
