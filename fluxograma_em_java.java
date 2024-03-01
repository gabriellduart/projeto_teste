package primeiro_projeto1;

import java.util.Scanner;

public class fluxograma_em_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variáveis
		double horatrab, valorhora, salbruto, saliqui ,inss;
		
		//Instaciar class Scanner
		Scanner ler = new Scanner(System.in);
		
		// Entrada de dados
		System.out.println("quantas horas você trabalha?: ");
		horatrab = ler.nextDouble ();
		System.out.println("qual valor da sua hora?: ");
		valorhora = ler.nextDouble();
		
		//Processamento
		salbruto = horatrab * valorhora;
		inss = salbruto * 0.12;
		saliqui = salbruto - inss;
		
		//Saida de dados
		System.out.println("O valor do seu salbruto é: " + salbruto + ",");
		System.out.println("O seu salário liquido é: " + saliqui + ".");
		
	
				
				
	}

}
