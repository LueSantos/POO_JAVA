package aula;

public class Eletrodomestico extends Produto{
	
	private String voltagem;

	public Eletrodomestico(String nome, double valor, String voltagem) {
		super(nome, valor);
		this.voltagem = voltagem;
	}
	
	@Override
	public String toString() {
		String mensagem = super.toString() + " Voltagem: " + this.voltagem;
		return mensagem;
	}

}
