package NoteBook;

public class Video extends Item {

	private int numofPlayer;
	
	public Video(String title, int playingTime, boolean gotIt, String comment, int numofPlayer) {
		super(title, playingTime, gotIt, comment);
		// TODO Auto-generated constructor stub
		this.numofPlayer = numofPlayer;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("Video:");
		super.print();
		System.out.print(numofPlayer);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
