import java.util.Scanner; 
public class Questao4 {

	public static void main(String[] args) {
		System.out.println("Digite a letra:");
		Scanner scan = new Scanner(System.in);
		char letra = scan.nextLine().charAt(0);
		
		switch(letra) {
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
			System.out.println("A letra '" + letra + "' é vogal!");
			break;
		default:
			System.out.println("A letra '" + letra + "' é consoante!");
		}
	}
	
}
