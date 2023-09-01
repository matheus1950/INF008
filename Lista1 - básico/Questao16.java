import java.util.Scanner;

public class Questao16 {

	public static void main(String[] args) {
		System.out.println("Digite os m² que serão pintados:");
		Scanner scan = new Scanner(System.in);
		double metros = scan.nextDouble();
		
		double tinta = metros*0.33;
		
		int latas = (int)tinta/18;
		
		if(tinta%18 != 0)
			latas += 1;
		
		System.out.println("latas = " + latas + "preço = " + latas*80);
		
	}

}
