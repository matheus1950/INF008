import java.util.Scanner;

public class LAB4 {

	public static void main(String[] args) {
		int quente = 40, frio = 10, atual;
		
		Scanner scan = new Scanner(System.in);
		
		atual = scan.nextInt();
		System.out.printf("Atual tem valor %d\n", atual);
		
		if(atual == quente)
			System.out.println("Quente");
		else if(atual == frio)
			System.out.println("FRIO");
		else if(atual > frio && atual < quente)
			System.out.println("Normal");
		else
			System.out.println("Temperatura Extrema");
		
		
		scan.close();
	}
}
