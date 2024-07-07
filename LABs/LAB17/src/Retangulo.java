
public class Retangulo {
	private int comprimento;
	private int largura;
	
	public Retangulo(int comprimento, int largura) {
		super();
		this.comprimento = comprimento;
		this.largura = largura;
	}
	
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}
	
	public int getArea() {
		return comprimento * largura;
	}
	
	public int perimetro() {
		return (comprimento*2) + (largura*2);
	}
	
	public Retangulo divide() {
		return new Retangulo(comprimento/2, largura/2);
	}

	@Override
	public String toString() {
		return "Retangulo [comprimento=" + comprimento + ", largura=" + largura + "]";
	}
	
}
