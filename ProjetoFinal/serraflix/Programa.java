package serraflix;

import javax.swing.JOptionPane;

public abstract class Programa implements Classificar {
	protected int pontuacao;
	protected String nome;
	protected Categoria categoria;

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int classificacao) {
		this.pontuacao = classificacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public void classificar(Integer classificacao) throws ClassificacaoForaDoRangeExceptions {
		try {
			if (classificacao >= 0 && classificacao <= 5) {
				setPontuacao(classificacao);
			} else
				throw new ClassificacaoForaDoRangeExceptions("Classificação inválida. Insira a pontuação entre 0 a 5.");
		} catch (ClassificacaoForaDoRangeExceptions e) {
			JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public Categoria escolherCategoria() {
		Object[] opProg = { "FANTASIA", "TERROR", "COMEDIA" };
		Object prog = JOptionPane.showInputDialog(null, "Escolha a Categoria", "Categorias",
				JOptionPane.PLAIN_MESSAGE, null, opProg, opProg[0]);
		String stringObjeto = prog.toString();
		Categoria newCat = Categoria.getEnum(stringObjeto);
		
		return newCat;
	}

	@Override
	public String toString() {
		String temp = "\n Nome: " + this.nome + "\n Pontuação: " + this.pontuacao + "\n Categoria: " + this.categoria; 
					
		return (temp.toString()
				.replace("[", "")
				.replace("]", "")
				.replace(",", ""));
	}
}