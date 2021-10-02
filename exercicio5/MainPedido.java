package exercicioDois;


import java.time.LocalDate;

public class MainPedido {

	public static void main(String[] args) {
		// Instances

		Pedido ped1 = new Pedido(1, LocalDate.of(2021,10,03), 20, 2.50);
		Pedido ped2 = new Pedido(4, LocalDate.of(2021,10,03), 50, 2.50);
		Pedido ped3 = new Pedido(7, LocalDate.of(2021,10,03), 25, 2.50);

		ped1.finalizar();
		ped2.finalizar();
		ped3.finalizar();
	
		System.out.println(ped1.getTotal());
		System.out.println(ped2.getTotal());
		System.out.println(ped3.getTotal());

	

		
	}

}
