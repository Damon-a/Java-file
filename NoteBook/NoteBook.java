package NoteBook;

import java.util.ArrayList;

import java.util.HashSet;

public class NoteBook {
	private ArrayList<String> notes = new ArrayList<String>(); 

	public void add(String s) {
		notes.add(s);
	}
	
	public void add(String s, int location) {
		notes.add(location, s);
	}

	public int getSize() {
		return notes.size();
	}
	
	public String getNote(int index) {
		return notes.get(index);
	}
	
	public void removeNote(int index) {
		notes.remove(index);
	}
	
	public String[] list() {
		String[] a = new String[notes.size()];
//		for (int i = 0; i < notes.size(); i++) {
//			a[i] = notes.get(i);
//		}
		notes.toArray(a);
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoteBook nb = new NoteBook();
		nb.add("fff");
		nb.add("jjj");
		nb.add("ddd", 1);
		nb.removeNote(1);
		String[] a = nb.list();
		for (String s : a) {
			System.out.println(s);
		}
		HashSet<String> b = new HashSet();
		b.add("fff");
		b.add("jjj");
		b.add("ff");
		System.out.println(b);
	}

}
