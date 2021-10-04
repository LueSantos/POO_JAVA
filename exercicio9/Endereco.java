package model;

public class Endereco {
	
	private String rua;
	private String bairro;
	private String cep;
	private Cidade cidade;
		
	
	public Endereco(String rua, String bairro, String cep, Cidade cidade) {
		this.rua = rua;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;	
	}
	
	 
	public String getRua() {
		return this.rua;
	}
	public String getBairro() {
		return this.bairro;
	}
	public String getCep() {
		return this.cep;
	}
	public Cidade getCidade() {
		return this.cidade;
	}
	
	
public String obterEnderecoCompleto() {
		return String.format("Rua: %s - Bairro: %s - Cep: %s" 
				+ this.getRua() + this.getBairro() + this.getCep() + this.getCidade().toString());
	}

	

}

