
public class PARXYNomes extends PARXY{
	private String x;
	private String y;
	
	
	
	public boolean xMaior() {
		return(x.compareTo(y) > 0);
	}
	
	public boolean iguaisXY() {
		return(x.equals(y));
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}
	
	
}
