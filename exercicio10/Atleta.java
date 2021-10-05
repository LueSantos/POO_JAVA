package aula;

public class Atleta implements Olimpiadas {
	
	private String nome;
	private double peso;
	private String modalidade;
	private int totalParticipantes;
	private Pais pais;
	
	
	public Atleta(String nome, double peso, String modalidade, int totalParticipantes, Pais pais) {
		this.nome = nome;
		this.peso = peso;
		this.modalidade = modalidade;
		this.totalParticipantes = totalParticipantes;
		this.pais = pais;
	}

	public String getNome() {
		return this.nome;
	}


	public double getPeso() {
		return this.peso;
	}


	public int getTotalParticipantes() {
		return this.totalParticipantes;
	}


	public String getModalidade() {
		return this.modalidade;
	}
	
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	
	public Pais getPais() {
		return this.pais;
		
	}

	@Override
	public String verificarSituacao() {
		
		String verifica = " ";
		
		if (this.peso > 90 && this.peso <=100 ) {
			this.modalidade = "peso Pesado.";
			verifica = "Participará na categoria ";	
		} 
		
		else if (this.peso >= 60 && this.peso <= 90) {
			this.modalidade = "peso Médio.";
			verifica = "Participará na categoria ";	
			}
		 else {
			 this.modalidade = "Não participará das Olímpiadas!";
			 verifica = " Desclassificado! ";
		 }
		
		return verifica; 
		}
	

	@Override
	public String toString() {
		return String.format( getNome() + " " + getPeso() + "Kg, " + "País de origem: " + getPais() 
		+ " - " + "Modalidade: " + getTotalParticipantes() + " " + getModalidade() 
		+ " - " + " Situação da atleta: " + this.verificarSituacao()); 
	}
	
}

