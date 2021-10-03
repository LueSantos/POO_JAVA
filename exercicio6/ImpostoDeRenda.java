package aula;

public class ImpostoDeRenda {
	
	//Atributos da classe com PROTECTED;

	protected String nome;
	protected String telefone;
	protected String email; 
	protected double rendimentos;
	
	
	//Construtor da classe;
	
	public ImpostoDeRenda(String nome, double rendimentos) {
		this.nome = nome;
		this.rendimentos = rendimentos;
	}
	
	//Método genérico que será sobrescrito nas outras classes;

	public void calculoIR() {
		this.rendimentos = this.rendimentos - (this.rendimentos * 0.12);
			
	}
}
