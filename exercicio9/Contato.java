package model;

public class Contato {
	
	private String nome;
	Endereco endereco;
	Telefone[] telefone;
	Cidade cidade;
	Estado estado;
	
	
	

	public Contato(String nome, Endereco endereco, Telefone[] telefone, Cidade cidade, Estado estado) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cidade = cidade;
		this.estado = estado;
	}


	public Telefone[] getTelefone() {
		return this.telefone;
	}


	public void setTelefone(Telefone[] telefone) {
		this.telefone = telefone;
	}


	public String getNome() {
		return this.nome;
	}


	public Endereco getEndereco() {
		return this.endereco;
	}



	public Cidade getCidade() {
		return this.cidade;
	}


	public Estado getEstado() {
		return this.estado;
	}


	
	public void monstrarTelefone() {
		
	
		for(int i = 0; i < telefone.length; i++ ) {
		
		System.out.println("Telefones: " + telefone[i].getNumero());
		}
	
	}

	
	@Override
	public String toString() {
		return String.format( "Nome: "+ this.nome + "\nEndereço: " + endereco.getRua() + ", " + endereco.getBairro() + ", " + "CEP: " + endereco.getCep()
		+ "\nCidade: " + cidade.getNomeCidade() + " " + "\nEstado: " + estado.getNomeEstado() + estado.getSigla());
		
	}
}
