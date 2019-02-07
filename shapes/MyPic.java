package shapes;

public class MyPic {
	public static void main(String[] args) 
	{
		Picture pic = new Picture(400,300);
		Rectangle r1 = new Rectangle(100, 100, 100, 100);
		Triangle t1 = new Triangle(100, 100, 200, 100, 150, 50);
		pic.add(t1);
		pic.draw();	
	}
}
