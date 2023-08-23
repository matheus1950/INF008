import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		System.out.println("Digite a temperatura em Celsius:");
		Scanner scan = new Scanner(System.in);
		double celsius = scan.nextDouble();
		double farenheit = celsius * 1.8 + 32;
		
		System.out.println("A temperatura em Farenheit é: " + farenheit);
	}

}
