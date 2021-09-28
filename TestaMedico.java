package aulas;

public class TestaMedico {
	
	public static void main(String[] args) {
		medico med = new medico();
	med.crm = "12345";
	med.nome = "Ana Maria";
	med.salario = 0;
	med.valorConsulta = 250;
	
	medico med2 = new medico("456789","Antônio", 0, 300);
	
	System.out.println(medico.totalMedico);

	med.pagamentoDinheiro();
	
	med2.pagamentoPlano();

	System.out.println("Doutora");
    System.out.println("Nome: " + med.nome);
    System.out.println("CRM: " + med.crm);
    System.out.println("Valor da consulta: " + med.valorConsulta);
    System.out.println("Salário desse mês: " + med.salario);

    System.out.println("\n");

    System.out.println("Doutor");
    System.out.println("Nome: " + med2.nome);
    System.out.println("CRM: " + med2.crm);
    System.out.println("Valor da consulta: " + med2.valorConsulta);
    System.out.println("Salário desse mês: " + med2.salario);


	}
 }
	
