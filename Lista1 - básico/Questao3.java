import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite os números que serão somados");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		
		System.out.println("A soma é :" + (numero1 + numero2));

	}

}
