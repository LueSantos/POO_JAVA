package serraflix;

public class Temporada {
	private int numeroTemporada;
	private int quantidadedeEpisodios;

	public Temporada(int numeroTemporada, int quantidadedeEpisodios) {
		super();
		this.quantidadedeEpisodios = quantidadedeEpisodios;
		this.numeroTemporada = numeroTemporada;
	}
	
	public int getQuantidadedeEpisodios() {
		return quantidadedeEpisodios;
	}

	public void setQuantidadedeEpisodios(int quantidadedeEpisodios) {
		this.quantidadedeEpisodios = quantidadedeEpisodios;
	}

	public int getNumeroTemporada() {
		return numeroTemporada;
	}

	public void setNumeroTemporada(int numeroTemporada) {
		this.numeroTemporada = numeroTemporada;
	}

	@Override
	public String toString() {
	
		return ("\n Temporadas: " + this.numeroTemporada+
				"\n Episódios p/ Temp: " + this.quantidadedeEpisodios);
	}
}