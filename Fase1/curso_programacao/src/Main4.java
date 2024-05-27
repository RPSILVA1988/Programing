import java.util.Locale;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // para aceitar o ponto como separador decimal
		Scanner sc = new Scanner(System.in);	// System.in = entrada de dados pelo teclado
	
		String x; // declarar variavel
		int y; // declarar variavel
		double z; // declarar variavel
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados:"); // imprimir o que foi digitado
		System.out.println(x); // imprimir o que foi digitado
		System.out.println(y); // imprimir o que foi digitado
		System.out.println(z); // imprimir o que foi digitado
										
		sc.close(); // fechar o scanner
	}
	
}
