import java.util.Scanner;

public class Questao18 {

	public static void main(String[] args) {
		System.out.println("Tamanho do arquivo e a velocidade do link em MBPS:");
		Scanner scan = new Scanner(System.in);
		
		int tamanho = scan.nextInt();
		int velocidade = scan.nextInt();
		
		int tempoEmSegundos = tamanho/velocidade;
		
		System.out.println("O tempo de download em minutos é : " + ((double)tempoEmSegundos/60));
	}

}
