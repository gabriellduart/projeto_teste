package primeiro_projeto1;

import java.util.Scanner;

public class nome_idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variáveis
		String nome, idade;
		//Instaciar class Scanner
		Scanner ler = new Scanner(System.in);
		
		// Entrada de dados
		System.out.println("Informe seu nome: ");
		nome = ler.next();
		
		System.out.println("Informe sua idade: ");
		idade = ler.next();
		
        //Saida de dados
		System.out.println("seu nome e sua idade: " + nome + ", " + idade +" anos ");
		
	
		
		

	}

}
