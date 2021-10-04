package aula;

public class Clinica extends Plano {
	
	private String nomeExame;
	private String cgc;
	
	
	public Clinica(String empresa, String nomeExame, String cgc) {
		super(empresa);
		this.nomeExame = nomeExame;
		this.cgc = cgc;
	}


	public String getNomeExame() {
		return this.nomeExame;
	}


	public String getCgc() {
		return this.cgc;
	}

	@Override
	public String toString() {
		return super.toString() + "Clinica: " + this.nomeExame;
	}

}
