package exerciocioImovel;

public class Imovel {
	
	
			
			int codImovel;
			String bairro;
			String tipo;
			double valor;
			
	
		public void Reajuste(String type, double val) {
			
			if (type == "casa") {
				System.out.println("O valor reajustado para imóvel do tipo casa é: " + (val = val * 1.05));
			}else if (type == "apto") {
				System.out.println("O valor reajustado para imóvel do tipo apto é: " + (val = val * 1.08));
			}else {
				System.out.println("Tipo de imóvel não reconhecido");
			}
		}

	
		public void Classificacao(double valor) {
			if (valor > 50000) {
				System.out.println("O imóvel é Classe A.");
				
			}else if (valor >= 10000 && valor < 50000 ) {
				
				System.out.println("O imóvel é Classe B.");
			}else if (valor < 10000) {
				System.out.println("O imóvel é Classe C.");
			}
		}

	}

