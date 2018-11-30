import java.io.*;
import java.util.*;
public class Calculator
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a=0,b=0;
		System.out.println("two numbers : ");
		for(int i=0;i<args.length;i++)
		{
			System.out.print(args[i]+" ");
		}
		System.out.println();
		for(int i=0;i<args.length;i++)
		{
			if(i == 0)
				a = Integer.parseInt(args[i]);
			else
				b = Integer.parseInt(args[i]);
		}
		System.out.println("Enter 1 to add, 2 to subtract, 3 to multiply and 4 for to divide");
		int ch = Integer.parseInt(br.readLine());
		switch(ch)
		{
			case 1:
			System.out.println("Sum = "+(a+b));
			break;
			case 2:
			System.out.println("Subtracted value = "+(a-b));
			break;
			case 3:
			System.out.println("Multiplied value = "+(a*b));
			break;
			case 4:
			System.out.println("Divided value = "+((float)a/(float)b));
			break;
		}
	}
}
