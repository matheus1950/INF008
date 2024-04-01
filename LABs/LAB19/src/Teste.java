
public class Teste {

	public static void main(String[] args) {
		
		int vetorx[] = {1,3,5,7,9};
		int vetory[] = {1,3,5,7,9};
	
		PARXYInt par = new PARXYInt();
		PARXYNomes nome = new PARXYNomes();
		PARXYVectores vetor = new PARXYVectores();
		
		par.setX(3);
		par.setY(2);
		
		nome.setX("Juliano");
		nome.setY("Marcos");
		
		vetor.setX(vetorx);
		vetor.setY(vetory);
		
		System.out.println("Testes");
		
		System.out.println("--------------Par--------------");
		System.out.println("Iguais?");
		System.out.println(par.iguaisXY());
		System.out.println("x Maior?");
		System.out.println(par.xMaior());
		
		System.out.println("--------------Nome--------------");
		System.out.println("Iguais?");
		System.out.println(nome.iguaisXY());
		System.out.println("x Maior?");
		System.out.println(nome.xMaior());
		
		System.out.println("--------------Vetor--------------");
		System.out.println("Iguais?");
		System.out.println(vetor.iguaisXY());
		System.out.println("x Maior?");
		System.out.println(vetor.xMaior());
	}
}
