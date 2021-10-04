package aula;

public class TestePlano {

	public static void main(String[] args) {
	
		
		Clinica clinica = new Clinica("Up Life", "Fisiotex", " CRM: 536188" );
		Medico med = new Medico("Saúde+", " Henrique Luz - CRM: ", 165789);
		Anestesista anest = new Anestesista("Rede Vida", "João Linx - CRM: " , 5678443, "Geral");
		ControlePagamento CP = new ControlePagamento();
		
		clinica.calcularPagamento();
		med.calcularPagamento();
		anest.calcularPagamento();
		
		CP.calcularTotalPago(clinica);
		CP.calcularTotalPago(med);
		CP.calcularTotalPago(anest);

		
		System.out.println(clinica.toString());
		System.out.println(med.toString());
		System.out.println(anest.toString());
		
		System.out.println(String.format("O total pago pelo plano é: %.2f.", CP.getTotalPago()));

	}

}
