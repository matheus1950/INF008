import java.util.Scanner; 
public class Questao8 {

	public static void main(String[] args) {
		System.out.println("Digite o preço dos 3 produtos");
		Scanner scan = new Scanner(System.in);
		double produto1 = scan.nextDouble();
		double produto2 = scan.nextDouble();
		double produto3 = scan.nextDouble();
			
		if(produto1 <= produto2 && produto1 <= produto3)
			System.out.println("Deve comprar o que vale :" + produto1 );
		else if(produto2 <= produto1  && produto2 <= produto3)
			System.out.println("Deve comprar o que vale  :" + produto2);
		else
			System.out.println("Deve comprar o que vale :" + produto3);
	}

}
