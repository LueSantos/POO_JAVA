package serraflix;

public class Filme extends Programa {
	private double duracao;

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}	

	@Override
	public String toString() {
		return (super.toString() + 
				"\n Duração: " + this.duracao+"\n");
	}
}