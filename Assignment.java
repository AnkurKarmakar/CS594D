import java.io.*;
import java.util.*;
public class Assignment
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();//inputting name
		System.out.println("String= "+s);
		
		System.out.println(s.charAt(1));
		
		System.out.println(s.compareTo(" "));
		
		System.out.println(s.equals(" "));
		
		System.out.println(s.equalsIgnoreCase(" "));
		
		System.out.println(s.indexOf('r'));
		
		System.out.println(s.length());
		
		System.out.println(s.substring(2));
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s.toUpperCase());
		
		char arr[] = new char[s.length()];
		System.out.printl(s.toCharArray());
		System.out.println(arr[0]);
		
		int a= Integer.valueOf(br.readLine());
		System.out.println(a.toString());
		System.out.println(s.charAt(1));
		
		String z="     Ankur      ";
		System.out.println(z.trim());
	}
}
/* charAt() , compareTo(), equals(), equalsIgnoreCase(), indexOf(), length() , substring(), toCharArray() , toLowerCase(), toString(), toUpperCase() , trim() , valueOf() 
*/
