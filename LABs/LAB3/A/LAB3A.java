
public class LAB3A {

	public static void main(String[] args) {
		int []inteiros = new int[5];
		String nomes[] = {"Zé", "João", "Tonho"};
		int i = 0; 
		int valor = 10;
		
		while(i < 5) {
			inteiros[i] = valor;
			
			valor++;
			i++;
		}
		
		for(int cont : inteiros) {
			System.out.println(cont);
		}
		
		for(String cont : nomes) {
			System.out.println(cont);
		}
		
		nomes[1] = "Maria";
		
		for(String cont : nomes) {
			System.out.println(cont);
		}
		
	}

}
