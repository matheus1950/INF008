import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		System.out.println("Digite 2 números inteiros e, após, 1 número real:");
		Scanner scan = new Scanner(System.in);
		int numeroInteiro = scan.nextInt();
		double numeroInteiro2 = scan.nextInt();
		double numeroReal = scan.nextDouble();
		
		System.out.println("a = " + (numeroInteiro * 2)/(numeroInteiro2/2) +  "b = " + (numeroInteiro * 3) + numeroReal + "c = " + Math.pow(numeroReal, 3));
	}

}
