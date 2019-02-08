package NoteBook;

public class CD extends Item{

	private String artist;
	private int numofTracks;

	public CD(String title, int playingTime, boolean gotIt, String comment, String artist, int numofTracks) {
		super(title, playingTime, gotIt, comment);
		this.artist = artist;
		this.numofTracks = numofTracks;
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.print("CD:");
		super.print();
		System.out.print(artist);
	}


	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		CD cd1 = (CD) arg0;
		return artist.equals(cd1.artist);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CD cd = new CD("abc", 60, true, "great", "Damon", 4);
		CD cd1 = new CD("abc", 60, true, "great", "Damon", 4);
		System.out.println(cd.equals(cd1));
	}
}
