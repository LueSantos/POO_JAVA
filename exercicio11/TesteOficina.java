package aula;

import java.time.LocalDate;

public class TesteOficina {

	public static void main(String[] args) {

		Proprietario dono = new Proprietario("Lara Linx");

		Carro car = new Carro("SUV", LocalDate.of(2021, 8, 17), dono, "CLiente Gold");

		
		car.revisao();
		car.trocarOleo();


		System.out.println("Proprietário: " + car.proprietario);
		System.out.println("Categoria: " + car.getCategoria());
		System.out.println("Modelo: " + car.modelo);
		System.out.println("Data de agendamento: " + car.dataConserto);
		System.out.println("Valor Total : " + car.valorCobrado);


	}

}