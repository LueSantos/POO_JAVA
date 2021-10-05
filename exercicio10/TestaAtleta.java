package aula;

public class TestaAtleta {

	public static void main(String []args) {
		
		Pais p1 = new Pais("Brazil");
		Pais p2 = new Pais("Argentina");

		
		Atleta at1 = new Atleta("Luiza Borges", 59.7, "Boxe", 1 , p2);
		Atleta at2 = new Atleta("Karen Batista", 71.0, "Boxe", 1, p1);
		Atleta at3 = new Atleta("Sarah Linx", 88.4, "Boxe", 1, p1);

		
		System.out.printf(at1.toString() + at1.getModalidade() + "\n" );
		System.out.printf("\n"+ at2.toString() + at2.getModalidade() + "\n");
		System.out.printf("\n"+ at3.toString() + at3.getModalidade());
		
		
	}
	
}
