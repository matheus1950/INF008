import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
		System.out.println("Digite, na ordem requerida, o quanto você ganha por hora e as suas horas trabalhadas no mês: ");
		
		Scanner scan = new Scanner(System.in);
		double reaisHora = scan.nextDouble();
		int horasTrabalhadas = scan.nextInt();
		
		System.out.println("Seu salário é: " + reaisHora * horasTrabalhadas + "reais");

	}

}
