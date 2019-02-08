package NoteBook;

import java.util.Scanner;
import java.util.HashMap;

public class Find {
	private HashMap<String, Integer> c = new HashMap<String, Integer>();
	Scanner in = new Scanner(System.in);
	private int i = 0;
	private int[][] a;
	
	public void addCity() {
		String s;
		while(!(s=in.next()).equals("###")) {
			c.put(s, i++);
		}
	}
	
	public void setDistance() {
		a = new int[i][i];
		for(int j = 0; j < i; j++) {
			for(int k = 0; k < i; k++) {
				a[j][k] = in.nextInt();
			}
		}
	}
	
	public int get() {
		return a[c.get(in.next())][c.get(in.next())];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Find city = new Find();
		city.addCity();
		city.setDistance();
		int d = city.get();
		System.out.println(d);
	}

}
