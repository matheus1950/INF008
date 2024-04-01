
public class PARXYVectores extends PARXY{
	private int x[];
	private int y[];
	
	
	public int[] getX() {
		return x;
	}
	public void setX(int[] x) {
		this.x = x;
	}
	public int[] getY() {
		return y;
	}
	public void setY(int[] y) {
		this.y = y;
	}
	
	public int somaVetorX() {
		int soma = 0;
		for(int cont : x) {
			soma += cont;
		}
		return soma;
	}
	
	public int somaVetorY() {
		int soma = 0;
		for(int cont : y) {
			soma += cont;
		}
		return soma;
	}
	
	public boolean xMaior() {
		return (somaVetorX() > somaVetorY());	
	}
	
	public boolean iguaisXY() {
		return (somaVetorX() == somaVetorY());
	}	
}
