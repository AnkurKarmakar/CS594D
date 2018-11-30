import java.io.*;

class MyException extends Exception{
	MyException(String n)
	{
		super(n);
	}
	
}

class Main
{
	public static void main(String args[])
	{
		int a = 5;
		
		try
		{
			if (a > 2)
				throw new MyException("this is my exception");
		}
		catch(MyException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
