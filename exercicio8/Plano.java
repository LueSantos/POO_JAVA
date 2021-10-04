package aula;

public class Plano {
	
	protected String empresa;
	protected double valorPago = 80;
	protected double valorIss = 5;
	
	
	public Plano(String empresa) {
		super();
		this.empresa = empresa;
	} 
	

	
	public double calcularPagamento() {
		return this.valorPago = this.valorPago - (this.valorPago * this.valorIss/100); 

	}

	

	public double getValorPago() {
		return this.valorPago;
	}
	
	
	@Override
	public String toString() {
	 return 
	    //String.format("Empresa: %s\n", this.empresa) +
	   // String.format("Valor Inicial: %.2f\n", this.valorPago) + 
	    //String.format("ISS Inicial: %.2f%", this.valorIss * 100); 
			 
	   String.format( "Empresa: %s -  Valor Pago: %.2f ", this.empresa, this.valorPago);
	 
	}
} 