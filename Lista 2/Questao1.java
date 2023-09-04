import java.util.Scanner; 
public class Questao1 {

	public static void main(String[] args) {
		System.out.println("Digite 2 números");
		Scanner scan = new Scanner(System.in);
		double numero1 = scan.nextDouble();
		double numero2 = scan.nextDouble();
		
		if(numero1 == numero2)
			System.out.println("São iguais!");
		else
			System.out.println((numero1 > numero2)? numero1 : numero2 + " é maior");
	}

}
