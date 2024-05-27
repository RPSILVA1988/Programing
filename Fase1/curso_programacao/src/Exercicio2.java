import java.util.Scanner;
import java.util.Locale;

public class Exercicio2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); //Configuração para o programa aceitar o ponto como separador decimal
        Scanner sc = new Scanner(System.in); //System.in = entrada de dados pelo teclado

        System.out.println("Digite a largura do terreno:"); //Imprimir mensagem na tela
        double largura = sc.nextDouble(); //Ler o que foi digitado

        System.out.println("Digite o comprimento do terreno:");
        double comprimento = sc.nextDouble();

        System.out.println("Digite o valor do metro quadrado:");
        double valorPorMetroQuadrado = sc.nextDouble();

        double area = largura * comprimento; //Calcular a área do terreno
        double preco = area * valorPorMetroQuadrado; //Calcular o preço do terreno

        System.out.printf("A área do terreno é: %.2f metros quadrados%n", area); //Imprimir a área do terreno
        System.out.printf("O preço do terreno é: %.2f%n", preco); //Imprimir o preço do terreno

        sc.close(); //Fechar o scanner
    }
}
