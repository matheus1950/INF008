
public class PARXYInt extends PARXY{
	private int x;
	private int y;
	
	public boolean xMaior() {
		if(x > y)
			return true;
		else
			return false;
	}
	
	public boolean iguaisXY() {
		if(x == y)
			return true;
		else
			return false;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	 
}
