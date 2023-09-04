import java.util.Scanner;

public class Questao15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite as horas trabalhas e o valor pago por hora");
		int horasTrabalhadas = scan.nextInt();
		double valorHora = scan.nextDouble();
		
		double salarioBruto = horasTrabalhadas * valorHora;
		
		System.out.println("Salário Bruto: " + salarioBruto);
		System.out.println("Pago ao INSS: " + (salarioBruto - salarioBruto*0.11));
		System.out.println("Pago ao Sindicato: " + (salarioBruto - salarioBruto*0.05));
		System.out.println("Salário Líquido: " + (salarioBruto - salarioBruto*0.11 - salarioBruto*0.05 - salarioBruto*0.08));
		
	}

}
