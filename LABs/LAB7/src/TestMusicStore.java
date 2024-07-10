	
public class TestMusicStore {

	public static void main(String[] args) {
		MusicStore store = new MusicStore();
		
		store.displayHoursOperation();
		
		store.setOwner("Roberto");
		
		System.out.println("\n" + store.getOwner() + ", Proprietário");

	}

}
