import java.util.Locale;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	// System.in = entrada de dados pelo teclado
		//Ao executar vai aguardar o usuario digitar algo "texto e depois enter" e depois digitar um numero e depois enter e depois um numero com ponto flutuante e depois enter
		// Exemplo:
					// texto
					// 10
					// 2.5
		
		String x; // declarar variavel
		int y; // declarar variavel
		double z; // declarar variavel
		
		x = sc.next(); // ler o que foi digitado
		y = sc.nextInt(); // ler o que foi digitado
		z = sc.nextDouble(); // ler o que foi digitado
		
		System.out.println("Voce digitou: " + x); // imprimir o que foi digitado
		System.out.println("Voce digitou: " + y); // imprimir o que foi digitado
			
		System.out.println("Voce digitou: " + z); // imprimir o que foi digitado
		
		Locale.setDefault(Locale.US); //Mudar o separador de casas decimais de , para .
		System.out.printf("Voce digitou: %.2f%n", z); // imprimir o que foi digitado com 2 casas decimais
				
		sc.close(); // fechar o scanner
	}
	
}
