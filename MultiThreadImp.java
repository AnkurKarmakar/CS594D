import java.io.*;
import java.util.*;
class MythreadImp implements Runnable{
	String name;
	MythreadImp(String n)
	{
	name=n;
	}
	public void run(){  
	System.out.println("thread is running..."); 
	//t.sleep(1000);
	for (int i=10;i!=0;i--)
		System.out.println(name +" " + i);
		
	}
	}
	
class MultiThreadImp{
public static void  main (String args[])
{
MythreadImp m1 = new MythreadImp("Ankur");
MythreadImp m2 = new MythreadImp("Debomoy");
Thread t1 =new Thread(m1);
Thread t2 =new Thread(m2);

t1.start();
t2.start();
t1.setPriority(8);
try{
t1.join(2000);
}
catch(Exception e){
System.out.println(e);
}
System.out.println("Get priority "+t1.getPriority());
System.out.println("Get priority "+t2.getPriority());
		try{
			t1.sleep(10);
			}
		catch (Exception e){
			System.out.println(e);
		}
System.out.println("Is alive "+t2.isAlive());
}
}
