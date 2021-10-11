package serraflix;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Biblioteca {
	public Programa programa;
	public List<Programa> programas = new ArrayList<Programa>();

	public Programa getPrograma() {
		return programa;
	}

	public Programa getPrograma(String nome) {						//Busca um programa pelo nome.
		for (Programa p : programas) {
			if (p.getNome().equals(nome)) {
				return p;
			}
		}
		return null;
	}

	public List<Programa> getProgramas(Categoria c) {	

		ArrayList<Programa> novaLista = new ArrayList<Programa>(); // Instancia uma nova lista para salvar os programas.
		
		for (Programa p : programas) { 							   // Busca na lista da biblioteca e adiciona na novaLista.
			if (p.categoria.equals(c))
				novaLista.add(p);
		}
		return novaLista;
	}
	
	public String listarTudo() {                                    // Lista e retorna toda biblioteca
		return (this.programas.toString()
					.replace("[", "")
					.replace("]", "")
					.replace(",", "")+"\n");
	}

    public void cadastrar(Programa programa) {
        if (!seExiste(programa)) {            
            this.programas.add(programa);
        } else {
        	JOptionPane.showMessageDialog(null, "NÃO Cadastrado! Programa já existe.","ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Verificação de CADASTRO duplicado
    public boolean seExiste(Programa programa) {
        for (Programa y : this.programas) {
            if ((Serie.class.isInstance(y)) && (y.getNome().equals(programa.nome))
                    && (y.getCategoria().equals(programa.categoria))) {
                return true;
            }
            else if ((Filme.class.isInstance(y)) && (y.getNome().equals(programa.nome))) {
                return true;
            }
        }
        return false;
    }
	
	public void remover(Programa Programa) {
		for (int i = 0; i < programas.size(); i++) {
			Programa g = programas.get(i);
			if (g.equals(Programa)) {
				this.programas.remove(g);
				JOptionPane.showMessageDialog(null, g.getNome(), "Removido!", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	
	public void listarTemporadas(Programa programa) {		
		for (Programa pr : programas) {
			if (Serie.class.isInstance(pr)) {
				Serie series = (Serie) pr;
				if(series.equals(programa)) {
				String series2 = (series.toString()
						.replace("[", "")
						.replace("]", "")
						.replace(",", "")+"\n" + "Quantidade Temporadas: "+ series.getQuantidadeTemporadas());
				
				JOptionPane.showMessageDialog(null, series2, "Quantidade Temporadas", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
	}
	
	public void editarNome(String nome, String novoNome) {
		for (Programa p : programas) {
			if (p.nome.equals(nome)) {
				p.nome = novoNome;
			}
		}
	}

	public void editarDuracao(String nome, double novaDuracao) {
		for (Programa pr : programas) {
			if (Filme.class.isInstance(pr) && pr.getNome().equals(nome)) {
				Filme filme = (Filme) pr;
				filme.setDuracao(novaDuracao);
			}
		}
	}
	
	public void editarTemporada(String nome, int decisao, int numeroTemporada, int quantidadedeEpisodios) {
		for (Programa pr : programas) {                                     // buscar por tds os programas.
			if (Serie.class.isInstance(pr) && pr.getNome().equals(nome)) {  // verifica se tem uma instancia com o msm nome.
				Serie serie = (Serie) pr;                                   // Cast de Serie
				for (Temporada tr : serie.getTemporada()) {                 // busca por tds as series.
					if (Temporada.class.isInstance(tr)) {                   // verifica se tem uma instancia com o msm nome
						Temporada tnova = (Temporada) tr;                   // Cast de temporada
						if (tnova.getNumeroTemporada() == decisao) {		// Define qual temporada vai editar
							tnova.setNumeroTemporada(numeroTemporada);
							tnova.setQuantidadedeEpisodios(quantidadedeEpisodios);
						}
					}
				}
			}
		}
	}
	
	public void classificar(Programa programa, int pontuacao) throws ClassificacaoForaDoRangeExceptions {
		for (Programa k : programas) {
			if (Serie.class.isInstance(k) && k.equals(programa)) {
				Serie serial = (Serie) k;
				serial.classificar(pontuacao);
				break;
			}else if (k.equals(programa)) {
				k.classificar(pontuacao);
				break;
			}
		}
	}

	@Override
	public String toString() {
		return this.programas.toString()
				.replace("[", "")
				.replace("]", "")
				.replace(",", "")+"\n";
	}
}