package aula;

import java.util.ArrayList;
import java.util.List;


public class App {
	
	
			public static void main(String[] args) throws AlunoException {
				
				Aluno aluno1 = new Aluno("Theo", 7.5, 9);
				Aluno aluno2 = new Aluno("Roberto", 5.5, 7.9);
				Aluno aluno3 = new Aluno("Claros", 8.7, 7.0);
				Aluno aluno4 = new Aluno("Sarah Linx", 10, 10);
				
				List<Aluno> alunoLista = new ArrayList<Aluno>();
				alunoLista.add(aluno1);
				alunoLista.add(aluno2);
				alunoLista.add(aluno3);
				alunoLista.add(aluno4);
			
				

				for (int i = 0; i < alunoLista.size(); i++) {//não posso usar o FOR EACH, pois preciso de indice pra percorrer.
		    		try{
		          		Aluno estudante = (Aluno)alunoLista.get(i);
		          		System.out.println(estudante.toString() + " Média: " 
		          		+ estudante.calcularMedia());
		         	}
		         	catch(AlunoException log){
		                	System.err.println(log.getMessage());
		         	}
						
			}
			
		
		
	}

}
