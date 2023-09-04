import java.util.Scanner; 
public class Questao9 {

	public static void main(String[] args) {
		System.out.println("Digite 3 números");
		Scanner scan = new Scanner(System.in);
		
		double numero[] = new double[3];
		double aux = 0;
		
		numero[0] = scan.nextDouble();
		numero[1] = scan.nextDouble();
		numero[2] = scan.nextDouble();
		
		
		for(int i = 0; i <= 2; i++) {
			for(int j = i + 1; j <= 2; j++) {
				if(numero[j] < numero[i]){
					aux = numero[i];
					numero[i] = numero[j];
					numero[j] = aux;
				}	
			}
		}
		
		for(int i = 2; i >= 0; i--) {
			System.out.println("Número:" + numero[i]);
		}
		
	}

}
