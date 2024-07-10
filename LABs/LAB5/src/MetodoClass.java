
public class MetodoClass {
	
	public void Welcome() {
		System.out.println("Seja Bem Vindo!!!");
	}
	
	public int addTwo(int num) {
		return num + 2;
	}
	
	public static void main(String[] args) {
		
		MetodoClass exemplo = new MetodoClass();
		
		exemplo.Welcome();
		
		int valor = 3;
		
		System.out.println("addTwo(" + valor + ") é " + exemplo.addTwo(valor));
		
		valor = 19;
		
		System.out.println("addTwo(" + valor + ") é " + exemplo.addTwo(valor));
		
	}

}
