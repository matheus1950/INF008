import java.util.Scanner;

public class Questao9 {

	public static void main(String[] args) {
		System.out.println("Digite a temperatura em Farenheit:");
		Scanner scan = new Scanner(System.in);
		double temperatura = scan.nextDouble();
		double celsius = (5 * (temperatura - 32) / 9);
		
		System.out.println("A temperatura em Celsius é: " + celsius);
	}

}
