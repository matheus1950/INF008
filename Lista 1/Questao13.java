import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {
		
		System.out.println("Digite a altura:");
		Scanner scan = new Scanner(System.in);
		double altura = scan.nextDouble();
		System.out.println("Digite o sexo:");
		String sexo = scan.next();
		
		if(sexo.equals("masculino")) {
			System.out.println("Peso ideal: " + ((72.7*altura) - 58));
			System.out.println("Digite seu peso atual:");
			double peso = scan.nextDouble();
			
			if(peso < ((72.7*altura) - 58))
				System.out.println("Abaixo do peso ideal");
			else if(peso == (72.7*altura) - 58)
				System.out.println("Exatamente no peso ideal");
			else
				System.out.println("Acima do peso ideal");
		}
		else {
			System.out.println("Peso ideal: " + ((62.1*altura) - 44.7));
			System.out.println("Digite seu peso atual:");
			double peso = scan.nextDouble();
			
			if(peso < ((62.1*altura) - 44.7))
				System.out.println("Abaixo do peso ideal");
			else if(peso == (62.1*altura) - 44.7)
				System.out.println("Exatamente no peso ideal");
			else
				System.out.println("Acima do peso ideal");
		}
		
		
	}

}
