package NoteBook;

import java.util.ArrayList;


public class DataBase {

	private ArrayList<Item> listItem = new ArrayList<Item>();
//	private ArrayList<CD> listCD = new ArrayList<CD>();
//	private ArrayList<DVD> listDVD = new ArrayList<DVD>();
//	public void add(CD cd) {
//		listCD.add(cd);
//	}
	
	public void add(Item item) {
		listItem.add(item);
	}
	
	public void list() {
		for(Item item:listItem) {
			item.print();
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBase db = new DataBase();
		db.add(new CD("abc", 60, true, "great", "Damon", 4));
		db.add(new DVD("111", 80, true,  "666", "Damon1"));
		db.add(new Video("Apex", 2019, true, "good", 1000));
		db.add(new Mp3("Cry", 1998, false, "perfect", "Damon"));
		db.list();

	}

}
