import java.util.Scanner; 
public class Questao3 {

	public static void main(String[] args) {
		System.out.println("Digite a letra:");
		Scanner scan = new Scanner(System.in);
		char letra = scan.nextLine().charAt(0);
		
		if(letra == 'F')
			System.out.println("Feminino!");
		else if(letra == 'M')
			System.out.println("Masculino!");
		else
			System.out.println("Sexo inválido!");
	}
	
}
