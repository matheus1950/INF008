import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		System.out.println("Digite o valor do lado de um quadrado: ");
		
		Scanner scan = new Scanner(System.in);
		double lado = scan.nextDouble();
		
		System.out.println("A área do quadrado multiplicada por 2 é: " + lado * lado * 2);

	}

}
