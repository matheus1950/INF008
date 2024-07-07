
public class Programa {

	public static void main(String[] args) {
		Retangulo ret = new Retangulo(2,4);
		
		System.out.println("Area " + ret.getArea());
		System.out.println("Comprimento " + ret.getComprimento());
		System.out.println("Largura " + ret.getLargura());
		System.out.println("Perimetro " + ret.perimetro());
		System.out.println("Dividido: " + ret.divide());
		
		System.out.println("==========Teste dos sets=============");
		ret.setComprimento(4);
		ret.setLargura(8);
		
		System.out.println("Area " + ret.getArea());
		System.out.println("Comprimento " + ret.getComprimento());
		System.out.println("Largura " + ret.getLargura());
		System.out.println("Perimetro " + ret.perimetro());
		System.out.println("Dividido: " + ret.divide());
	}

}
