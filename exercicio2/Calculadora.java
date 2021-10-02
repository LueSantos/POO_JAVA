package exercio2;
import java.util.Scanner;

public class Calculadora {
	
	double soma, subtracao, multiplicacao,divisao;
	double n1,n2;
	int op;
	
	Scanner ler = new Scanner(System.in);
	
	public void Calculo() {
		System.out.printf("Informe do primeiro valor: ");
		n1 = ler.nextDouble();
		
		System.out.printf("Informe do segundo valor: ");
		n2 = ler.nextDouble();
		
		System.out.printf("Selecione a operação:\n ");
		System.out.printf("1- Soma\n");
		System.out.printf("2- Subtração\n ");
		System.out.printf("3- Multiplicação\n ");
		System.out.printf("4- Divisão\n ");
		System.out.printf("5- Sair\n ");

		
		op = ler.nextInt();
		
		switch(op) {
		
		case 1: soma = n1 + n2;
		 System.out.printf("O resultado é:  " + soma);
		 break;
		 
		case 2: subtracao = n1 - n2;
		 System.out.printf("O resultado é:  " + subtracao);
		 break;
		
		case 3: multiplicacao = n1 * n2;
		 System.out.printf("O resultado é:  " + multiplicacao);
		 break;
		 
		case 4: divisao = n1 / n2;
		 System.out.printf("O resultado é:  " + divisao);
		 break; 

		default: System.out.printf("sair");
		
		
		}
		
		
	}
	

}
