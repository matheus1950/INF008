import java.util.Scanner; 
public class Questao10 {

	public static void main(String[] args) {
		System.out.println("Digite o seu turno(M-matutino ou V-Vespertino ou N- Noturno):");
		Scanner scan = new Scanner(System.in);
		char letra = scan.nextLine().charAt(0);
		
		switch(letra) {
		case 'M' :	
			System.out.println("Bom Dia!");
			break;
		case 'V' :	
			System.out.println("Boa Noite!");
			break;
		case 'N' :	
			System.out.println("Boa Tarde!");
			break;
		default:
			System.out.println("Valor Inválido!");
		}
	}
	
}
