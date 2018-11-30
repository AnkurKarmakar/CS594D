public class Main
{
	public static void main(String args[])
	{
		circle c = new circle(5);
		c.area();
		c.display();
		
		rectangle r1 = new rectangle(5,10);
		r1.area();
		r1.display();
		
		rectangle r2 = new rectangle(5);
		r2.area();
		r2.display();
		System.out.println();
		Shape s1=new circle(7);
		s1.area();
		s1.display();
		
		Shape s2=new rectangle(8,9);
		s2.area();
		s2.display();
	}
}
