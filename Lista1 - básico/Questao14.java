import java.util.Scanner;

public class Questao14 {

	public static void main(String[] args) {
		double excesso = 0, multa = 0;
		
		System.out.println("Digite o kg dos peixes pescados por João:");
		Scanner scan = new Scanner(System.in);
		double peso = scan.nextDouble();
		if(peso >= 50) {
			excesso = (peso - 50);
			multa = (int)excesso * 4;
		}
		System.out.println("Excesso: " + excesso + "\nMulta: " + multa);
	}
}
