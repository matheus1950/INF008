import java.util.Scanner; 
public class Questao2 {

	public static void main(String[] args) {
		System.out.println("Digite o número");
		Scanner scan = new Scanner(System.in);
		double numero = scan.nextDouble();
		
		if(numero == 0)
			System.out.println("É neutro!");
		else if(numero > 0)
			System.out.println("É positivo!");
		else
			System.out.println("É negativo!");
	}

}
