import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	// System.in = entrada de dados pelo teclado
	
		char x; // declarar variavel
		x = sc.next().charAt(0); // ler o que foi digitado 
		System.out.println("Voce digitou: " + x); // imprimir o que foi digitado
								
		sc.close(); // fechar o scanner
	}
	
}
