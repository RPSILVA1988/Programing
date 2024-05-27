import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // System.in = entrada de dados pelo teclado
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine(); // consumir a quebra de linha que ficou pendente na entrada do numero inteiro
		s1 = sc.nextLine(); // ler a linha inteira, tem q ter o Line, se tiver apenas next, ler somente priomeira palavra que foi digitado e vai quebrar para outra linha a segunda palavra digitada na mesma Linha
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close(); // fechar o scanner
	}

}
