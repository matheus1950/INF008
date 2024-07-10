
public class MusicStore {
	private String owner = "sem dono";
	
	
	public String getOwner() {
		return owner;
	}


	public void setOwner(String dono) {
		owner = dono;
	}
	
	
	public void displayHoursOperation() {
		System.out.println("Período: \r\n"
				+ "Diariamente das 9:00 - 21:00");
	}
	
}
