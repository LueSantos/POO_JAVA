package serraflix;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SerraflixMain {

	public static void main(String[] args) throws ClassificacaoForaDoRangeExceptions {

		Biblioteca serraflix = new Biblioteca();
		
		//Biblioteca Padrão.
        Serie serie1 = new Serie();
        Serie serie2 = new Serie();
        Serie serie3 = new Serie();
        
        serie1.setNome("Game Of Thrones");       
        serie1.getTemporada().add(new Temporada(1,10));
        serie1.getTemporada().add(new Temporada(2,10));
        serie1.getTemporada().add(new Temporada(3,10));
        serie1.getTemporada().add(new Temporada(4,10));
        serie1.getTemporada().add(new Temporada(5,10));
        serie1.getTemporada().add(new Temporada(6,10));
        serie1.getTemporada().add(new Temporada(7,7));
        serie1.getTemporada().add(new Temporada(8,6));
        serie1.setCategoria(Categoria.FANTASIA);
        serraflix.cadastrar(serie1);
        Programa serieUm = (Programa)serie1;
        serraflix.classificar(serieUm, 7);
        
        serie2.setNome("Rick and Morty");
        serie2.getTemporada().add(new Temporada(1,11));
        serie2.getTemporada().add(new Temporada(2,10));
        serie2.getTemporada().add(new Temporada(3,10));
        serie2.getTemporada().add(new Temporada(4,10));
        serie2.getTemporada().add(new Temporada(5,9));
        serie2.setCategoria(Categoria.COMEDIA); 
        serraflix.cadastrar(serie2);
        Programa serieDois = (Programa)serie2;
        serraflix.classificar(serieDois, 10);
        
        serie3.setNome("A Maldição da Residência Hill");
        serie3.getTemporada().add(new Temporada(1,10));
        serie3.setCategoria(Categoria.TERROR);
        serraflix.cadastrar(serie3);
        Programa serieTres = (Programa)serie3;
        serraflix.classificar(serieTres, 5);
        
        Filme filme1 = new Filme();
        Filme filme2 = new Filme();
        Filme filme3 = new Filme();
        
        filme1.setNome("Vingadores: Ultimato");
		filme1.setDuracao(181);
		filme1.setCategoria(Categoria.FANTASIA);
		serraflix.cadastrar(filme1);
		Programa filmeUm = (Programa)filme1;
		serraflix.classificar(filmeUm, 5);
		
		filme2.setNome("A Bruxa de Blair");
		filme2.setDuracao(81);
		filme2.setCategoria(Categoria.TERROR);
		serraflix.cadastrar(filme2);
		Programa filmeDois = (Programa)filme2;
		serraflix.classificar(filmeDois, 3);
		
		filme3.setNome("The Hitman's Bodyguard");
		filme3.setDuracao(118);
		filme3.setCategoria(Categoria.COMEDIA);
		serraflix.cadastrar(filme3);
		Programa filmeTres = (Programa)filme3;
		serraflix.classificar(filmeTres, 4);
		//Fim da Biblioteca Padrão.
		
		Object op;

		do {

			Object[] opcoes = { "Cadastrar", "Editar", "Remover", "Classificar", "Buscar Por Categoria",
					"Buscar Por Nome", "Listar Temporadas", "Listar Tudo", "Sair" };
			op = JOptionPane.showInputDialog(null, "Bem-Vindo ao SERRAFLIX\nEscolha uma opção", "SERRAFLIX", JOptionPane.PLAIN_MESSAGE,
					null, opcoes, opcoes[0]);

			if (op != null) {
				switch (op.toString()) {

				case "Cadastrar":

					Object[] opProg = { "Série", "Filme" };
					Object prog = JOptionPane.showInputDialog(null, "O que deseja cadastrar?", "CADASTRO",
							JOptionPane.QUESTION_MESSAGE, null, opProg, opProg[0]);
					if (prog == null) {break;};

					String stringCadastrar = prog.toString();

					if (stringCadastrar == "Série") {
						Serie serie = new Serie();

						String nome = JOptionPane.showInputDialog("Digite o nome da série:");
						if (nome == null) {break;};
						serie.setNome(nome);

						int setTemp;
						
						do {
							String numTemp = JOptionPane.showInputDialog("Digite o número da temporada:");
							if (numTemp == null) {break;};
							Integer numInt = Integer.parseInt(numTemp);

							String numTemp2 = JOptionPane.showInputDialog("Digite o número dos episódios:");
							if (numTemp2 == null) {break;};						
							Integer numInt2 = Integer.parseInt(numTemp2);
							
							serie.getTemporada().add(new Temporada(numInt, numInt2));
							
							setTemp = JOptionPane.showConfirmDialog(null, "Deseja adicionar outra temporada?",
									"Temporadas", JOptionPane.YES_NO_OPTION);
						} while (setTemp == 0);

						serie.setCategoria(serie.escolherCategoria());
						serraflix.cadastrar(serie);
					} else {
						Filme filme = new Filme();
						String nome = JOptionPane.showInputDialog("Digite o nome do filme:");
						if (nome == null) {break;};

						String numTemp = JOptionPane.showInputDialog("Digite a duração do filme (em minutos):");
						if (numTemp == null) {break;};
						Double numDou = Double.parseDouble(numTemp);

						filme.setCategoria(filme.escolherCategoria());
						filme.setDuracao(numDou);
						filme.setNome(nome);
						serraflix.cadastrar(filme);
					}
					break;

				case "Editar":
					Object[] editArray = (Object[])serraflix.programas.toArray();
					Object edit = JOptionPane.showInputDialog(null, "Escolha o programa para remover.", "Editar",
							JOptionPane.PLAIN_MESSAGE, null, editArray, editArray[0]);
					Programa e = (Programa)edit;
					
					for (Programa k : serraflix.programas) {
						if (Serie.class.isInstance(k) && k.equals(e)){
							String novoNome = JOptionPane.showInputDialog("Digite o novo nome da série:");
							if (novoNome == null) {break;};
							
							int trocaTemp;
							do {	
								String setTemp = JOptionPane.showInputDialog("Qual Temporada deseja editar?");
								if (setTemp == null) {break;};
								Integer numDou = Integer.parseInt(setTemp);
								
								String numTemp = JOptionPane.showInputDialog("Digite o novo número da temporada:");
								if (numTemp == null) {break;};
								Integer numInt = Integer.parseInt(numTemp);

								String numTemp2 = JOptionPane.showInputDialog("Digite o novo número dos episódios:");
								if (numTemp2 == null) {break;};
								Integer numInt2 = Integer.parseInt(numTemp2);
							
								serraflix.editarTemporada(e.getNome(),numDou,numInt, numInt2);
								serraflix.editarNome(e.getNome(), novoNome);
								trocaTemp = JOptionPane.showConfirmDialog(null, "Deseja editar outra temporada?",
										"Temporadas", JOptionPane.YES_NO_OPTION);
							} while (trocaTemp == 0);
							
						} else if (k.equals(e)) {
							String novoNome = JOptionPane.showInputDialog("Digite o novo nome do filme:");
							if (novoNome == null) {break;};

							String numTemp = JOptionPane.showInputDialog("Digite a nova duração do filme (em Minutos):");
							if (numTemp == null) {break;};
							Double numDou = Double.parseDouble(numTemp);

							serraflix.editarDuracao(e.getNome(), numDou);
							serraflix.editarNome(e.getNome(), novoNome);
						}
					}
					break;

				case "Remover":
					Object[] removeArray = (Object[])serraflix.programas.toArray();
					Object removes = JOptionPane.showInputDialog(null, "Escolha o programa para remover.", "Excluir",
							JOptionPane.PLAIN_MESSAGE, null, removeArray, removeArray[0]);
					Programa r = (Programa)removes;
					
					serraflix.remover(r);
					break;

				case "Classificar":
					Object[] classifArray = (Object[])serraflix.programas.toArray();
					Object classificacao = JOptionPane.showInputDialog(null, "Escolha o programa para classificar.", "Classificar",
							JOptionPane.PLAIN_MESSAGE, null, classifArray, classifArray[0]);
					if (classificacao == null) {break;};
					Programa c = (Programa)classificacao;
					
					String numTemp = JOptionPane.showInputDialog("Digite a classificação:");
					if (numTemp == null) {break;};
					Integer numClass = Integer.parseInt(numTemp);
					
					serraflix.classificar(c, numClass);
					break;

				case "Buscar Por Categoria":
					Object[] opCateg = { "FANTASIA", "TERROR", "COMEDIA" };
					Object categ = JOptionPane.showInputDialog(null, "Escolha a Categoria", "Categorias",
							JOptionPane.PLAIN_MESSAGE, null, opCateg, opCateg[0]);
					if (categ == null) {break;};
					String stringObjeto = categ.toString();

					Categoria buscaCateg = Categoria.getEnum(stringObjeto);
					String encontradoCat = serraflix.getProgramas(buscaCateg).toString()
							.replace("[", "")
							.replace("]", "")
							.replace(",", "");

					JTextArea textoArea = new JTextArea(encontradoCat);
					JScrollPane scrollPanes = new JScrollPane(textoArea);  
					textoArea.setLineWrap(true);  
					textoArea.setWrapStyleWord(true); 
					scrollPanes.setPreferredSize( new Dimension( 400, 400 ) );
					JOptionPane.showMessageDialog(null, scrollPanes, "Programa:", JOptionPane.PLAIN_MESSAGE);
					break;

				case "Buscar Por Nome":
					String buscaNome = JOptionPane.showInputDialog("Digite o nome do programa:");
					if (buscaNome == null) {break;};
					String encontradoNome = serraflix.getPrograma(buscaNome).toString();

					JOptionPane.showMessageDialog(null, encontradoNome, "Programa:", JOptionPane.PLAIN_MESSAGE);
					break;

				case "Listar Temporadas":
					Object[] listarTemps = (Object[])serraflix.programas.toArray();
					Object temps = JOptionPane.showInputDialog(null, "Escolha uma série", "Listar Temporadas",
							JOptionPane.PLAIN_MESSAGE, null, listarTemps, listarTemps[0]);
					Programa s = (Programa)temps;
					
					serraflix.listarTemporadas(s);
					break;

				case "Listar Tudo":
					String lista = serraflix.listarTudo();

					JTextArea textArea = new JTextArea(lista);
					JScrollPane scrollPane = new JScrollPane(textArea);  
					textArea.setLineWrap(true);  
					textArea.setWrapStyleWord(true); 
					scrollPane.setPreferredSize( new Dimension( 400, 400 ) );
					JOptionPane.showMessageDialog(null, scrollPane, "Listar Tudo",JOptionPane.YES_NO_OPTION);
					
					break;

				case "Sair":
					int sair = JOptionPane.showConfirmDialog(null, "Deseja mesmo sair?", "Sair",
							JOptionPane.YES_NO_OPTION);
					if (sair == 0) {
						op = null;
					}
					break;
				}
			}
		} while (op != null);
	}
}