import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		System.out.println("Digite um valor em metros:");
		
		Scanner scan = new Scanner(System.in);
		double metros = scan.nextDouble();
		
		System.out.println("O valor em centímetros é: " + metros*100);
	}

}
