public class rectangle extends Shape
{
	rectangle(int x, int y)
	{	super();
		a=x;
		b=y;
	}
	rectangle(int x)
	{	super();
		a=1;
		b=x;
	}
	public void area()
	{
		area=a*b;
	}
}
