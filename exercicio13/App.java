package aula;


public class App {

	public static void main(String[] args) {
	
	
	
		
				Produto p1 = new BebidaAlcoolica("Cerveja - Relengo Smoked", 12.0, "9%"); 
				Produto p2 = new BebidaAlcoolica("Vinho - Stª Cruix", 150.0, "35%"); 
				Produto p3 = new Eletrodomestico("TV - 6NAV com Resolução 8K", 2000.0, "127 V"); 
				Produto p4 = new Eletrodomestico("Geladeira - Matrikys", 2352.64, "127 V"); 
				Produto p5 = new Eletrodomestico("Rádio - RingX", 837.59, "bivolt"); 
				
				CalcularTotal calT = new CalcularTotal();
				
				System.out.println(p1.toString());
				System.out.println("Valor total: R$" + p1.Vender(5)+"\n");
				calT.calcularTotalP(p1);
				
				System.out.println(p2.toString());
				System.out.println("Valor total: R$" + p2.Vender(3)+"\n");
				calT.calcularTotalP(p2);
				
				System.out.println(p3.toString());
				System.out.println("Valor total: R$" + p3.Vender(9)+"\n");
				calT.calcularTotalP(p3);
				
				System.out.println(p4.toString());
				System.out.println("Valor total: R$" + p4.Vender(3)+"\n");
				calT.calcularTotalP(p4);
				
				System.out.println(p5.toString());
				System.out.println("Valor total: R$" + p5.Vender(1)+"\n");
				calT.calcularTotalP(p5);
				
				
				
				System.out.println("*** Valor Total *** R$" + calT.getTotalPago());

			}

	}


