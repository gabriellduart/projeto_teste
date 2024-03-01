package primeiro_projeto1;
import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Variáveis
		double a,b,som;
		//Instaciar class Scanner
		Scanner ler = new Scanner(System.in);
		
		// Entrada de dados
		System.out.println("Informe seu nome completo: ");
		a = ler.nextDouble();
		
		System.out.println("Informe sua idade: ");
		b = ler.nextDouble();
		
		//Processamento
		ler = a+b;
		//Sáida
		System.out.println("O resultado é : " + som);
			
	}

}
