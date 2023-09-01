import java.util.Scanner;

public class Questao17 {

	public static void main(String[] args) {
		System.out.println("Digite os m² que serão pintados:");
		Scanner scan = new Scanner(System.in);
		double metros = scan.nextDouble();
		
		double tinta = metros*0.16;
		System.out.println("tinta: " + tinta);
		int latas = (int)tinta/18;
		
		if(tinta%18 != 0)
			latas += 1;
		
		System.out.println("Apenas latas de tinta: latas = " + latas + "preço = " + latas*80);
		
		int galoes = (int)(tinta/3.6);
		
		if(tinta/3.6 != (int)(tinta/3.6))
			galoes += 1;
		
		System.out.println("Apenas galoes de tinta: galoes = " + galoes + "preço = " + galoes*25);
		
		//mistura
		double tintaComFolga = tinta + tinta*0.10; //acrescimo de 10%
		System.out.println("tintaCfolga: " + tintaComFolga);
		
		if(tintaComFolga > 10.8) { //latas
			if(tintaComFolga < 18) {
				latas = 1;
				tintaComFolga = 0;
			}
			else {
				latas = (int)tintaComFolga/18;
				tintaComFolga = tintaComFolga%18;
			} 
			
		}
		
		if(tintaComFolga > 0) { //galoes
			if(tintaComFolga < 3.6) {
				galoes = 1;
			}
			else {
				galoes = (int)(tintaComFolga/3.6);
			}
				
		}
		
		System.out.println("Apenas galoes de tinta: galoes = " + galoes + "latas = " + latas + "preço = " + (latas*80 + galoes*25));
		
	}

}
