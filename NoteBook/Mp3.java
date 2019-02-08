package NoteBook;

public class Mp3 extends Item {

	private String artist;
	
	public Mp3(String title, int playingTime, boolean gotIt, String comment, String artist) {
		super(title, playingTime, gotIt, comment);
		this.artist = artist;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("Mp3:");
		super.print();
		System.out.print(artist);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
