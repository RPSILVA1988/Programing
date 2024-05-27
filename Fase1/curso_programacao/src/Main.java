import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		//Primeiro exemplo;
		int y = 32;
		double x = 10.35784;
		
		//Segundo exemplo;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
				
		//Este é Primeiro exemplo;
		System.out.println(y);
		System.out.printf("%.1f%n", x); //%.1f é um especificador de formato (1 casas Decimais), %n é uma nova linha
		System.out.printf("%.2f%n", x); //%.2f é um especificador de formato (2 casas Decimais), %n é uma nova linha
		Locale.setDefault(Locale.US); //Mudar o separador de casas decimais de , para .
		System.out.printf("%.4f%n", x); //%.4f é um especificador de formato (4 casas Decimais), %n é uma nova linha
		System.out.printf("%.6f%n", x); //%.6f é um especificador de formato (6 casas Decimais), %n é uma nova linha
		System.out.println("RESULTADO = " + x + " METROS"); //Concatenares de String, repare que o zero a direita sumiu
	    System.out.printf("RESULTADO = %.2f METROS%n", x); //%.2f é um especificador de formato (2 casas Decimais), %n é uma nova linha
	    
	    //Este é Segundo exemplo;
	    System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); 
	    //%s é um especificador de formato para String, %d é um especificador de formato para Inteiro, %.2f é um especificador de formato para Double, %n é uma nova linha")
	    
	}
}
