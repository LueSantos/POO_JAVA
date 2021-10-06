package aula;


	public class BebidaAlcoolica extends Produto{
		
		private String TeorAlcoolico;
		

		public BebidaAlcoolica(String nome, Double valor, String teorAlcoolico) {
			super(nome, valor);
			TeorAlcoolico = teorAlcoolico;
		}
		@Override
		public String toString() {
			String mensagem = super.toString() + " Teor Alcoolico: " + this.TeorAlcoolico;
			return mensagem;
		}


}
