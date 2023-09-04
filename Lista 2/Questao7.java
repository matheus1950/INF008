import java.util.Scanner; 
public class Questao7 {

	public static void main(String[] args) {
		System.out.println("Digite 3 números");
		Scanner scan = new Scanner(System.in);
		double numero1 = scan.nextDouble();
		double numero2 = scan.nextDouble();
		double numero3 = scan.nextDouble();
		
		if(numero1 >= numero2 && numero1 >= numero3)
			System.out.println("O maior é :" + numero1);
		else if(numero2 >= numero1 && numero2 >= numero3)
			System.out.println("O maior é :" + numero2);
		else
			System.out.println("O maior é :" + numero3);
		
		
		if(numero1 <= numero2 && numero1 <= numero3)
			System.out.println("O menor é :" + numero1);
		else if(numero2 <= numero1 && numero2 <= numero3)
			System.out.println("O menor é :" + numero2);
		else
			System.out.println("O menor é :" + numero3);
	}

}
