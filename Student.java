import java.io.*;
class Student
{
	int rollno; String name; String dept; int marks;
	void get(int r, String n, String d, int m)
	{
		rollno = r; name = n; dept = d; marks = m;
	}
	static void findHighest(Student arr[])
	{
		int max = 0; String max_name="";
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i].marks > max)
			{
				max = arr[i].marks;
				max_name = arr[i].name;
			}
		}
		System.out.println("The student who got highest marks= "+ max_name);
	}
	static void findLowest(Student arr[])
	{
		long min = 9999999; String min_name=" ";
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i].marks < min)
			{
				min = arr[i].marks;
				min_name = arr[i].name;
			}
		}
		System.out.println("The student who got lowest marks= "+ min_name);
	}
	static void findMoreThanAvg(Student arr[])
	{
		double average, sum=0;
		for(int i=0; i<arr.length; i++)
		{
		sum = sum + arr[i].marks;
		}
		average = sum / (arr.length);
		System.out.println("The students who got more than average marks: ");
		for(int j=0; j<arr.length; j++)
		{
			if(arr[j].marks > average)
			{
				System.out.println(arr[j].name);
			}
		}
	}
	public static void main(String args[])throws IOException
	{
		Student ob[] = new Student[5];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i=0; i<5; i++)
		{
			ob[i] = new Student();
			System.out.println("Enter roll no, name, department and marks= ");
			int a = Integer.parseInt(br.readLine());
			String b = br.readLine();
			String c = br.readLine();
			int d = Integer.parseInt(br.readLine());
			ob[i].get(a,b,c,d);
		}
		findHighest(ob);
		findLowest(ob);
		findMoreThanAvg(ob);
	}

}
