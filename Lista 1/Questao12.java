import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
		
		System.out.println("Digite a altura:");
		Scanner scan = new Scanner(System.in);
		double altura = scan.nextDouble();
		System.out.println("Peso ideal: "  + (72.7*altura - 58));
	}

}
