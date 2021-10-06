package aula;

public class CalcularTotal {
	
		
		private double totalPago;
		
			
		public double getTotalPago() {
			return totalPago;
		}

		
	public double calcularTotalP(Produto produto) {
		
		this.totalPago += produto.getTotal();	
		return totalPago;
		}

	}