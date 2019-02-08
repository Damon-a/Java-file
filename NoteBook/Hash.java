package NoteBook;

import java.util.HashMap;

public class Hash {
     
    private HashMap<String, student> stu = new HashMap<String, student>();

    public void addA(String sname, student name) {
    	stu.put(sname, name);
    }
    
    public void getOneScore(String s) {
    	for (String k:stu.keySet()) {
    		int score = stu.get(k).getScore(s);
    		if(score==0) {
    			System.out.println(k+":No Data");
    		}
    		else {
    			System.out.println(k + ":" + score);
    	
    		}
    	}
    }
    public static void main ( String [] args ) {
        Hash database = new Hash();
        student m = new student();
        student y = new student();
        y.add("xd", 92);
        y.add("math", 81);
        m.add("english", 77);
        m.add("math", 99);
        m.add("struct", 94);
        database.addA("m", m);
        database.addA("y", y);
        int t = m.getScore("math");
        System.out.println(t);
        database.getOneScore("english");
    
    }
}

class student{
	private HashMap<String, Integer> scores = new HashMap<String, Integer>();
	
	public void add(String coure, int score) {
		scores.put(coure, score);
	}
	
	public int getScore(String coure) {
		if(scores.containsKey(coure)) {
			return scores.get(coure);
		}
		else {
			return 0;
		}
	}
	
	public void getScores() {
		System.out.println(scores);
	}
}