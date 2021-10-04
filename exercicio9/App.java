package model;



public class App {

	public static void main(String[] args) {
		
		Estado estado  = new Estado("Tocantins", " - TO");
		Cidade cidade = new Cidade("Sobradinho", estado);
		Endereco End = new Endereco("Rua do Amor nº420" , "Bairro - Campo Verde ", "23.678-44", cidade);
		Telefone[] telefone = new Telefone[2];
		Telefone fone1 = new Telefone("63 3345-6785");
		Telefone fone2 = new Telefone("63 98887-6435");

		telefone[0] = fone1;
		telefone[1] = fone2;
		
		Contato contato = new Contato("Sarah Linx", End, telefone, cidade, estado);
		
		System.out.println(contato.toString());
		contato.monstrarTelefone();
		
		
	}

}