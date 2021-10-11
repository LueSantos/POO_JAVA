package serraflix;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Serie extends Programa {
	private List<Temporada> temporadas = new ArrayList<Temporada>();	

	public List<Temporada> getTemporada() {
		return temporadas;
	}

	public void setTemporadas(Temporada temporadas) {
		this.temporadas.add(temporadas);
	}

	@Override
	public void classificar(Integer classificacao) throws ClassificacaoForaDoRangeExceptions {
		try {
			if (classificacao >= 0 && classificacao <= 10) {
				this.pontuacao = classificacao;
			} else
				throw new ClassificacaoForaDoRangeExceptions("Classificação inválida. Insira a pontuação entre 0 a 10.");
		} catch (ClassificacaoForaDoRangeExceptions e) {
			JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	@Override
	public String toString() {					
			String temp = temporadas.toString()
			.replace("[", "")
			.replace("]", "")
			.replace(",", "");		
		return (super.toString()+" "+temp+"\n");
	}
	
	public int getQuantidadeTemporadas() {
		return this.temporadas.size();
	}
}