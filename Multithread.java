import java.io.*;
import java.util.*;
class MyThread extends Thread{
	Thread t;
	String name;
	MyThread(String n)
	{
	name=n;
	t=new Thread(n);
	}
	public void run(){  
	System.out.println("thread is running..."); 
	//t.sleep(1000);
	for (int i=10;i!=0;i--)
		System.out.println(name +" " + i);
		try{
			t.sleep(10);
			}
		catch (Exception e){
			System.out.println(e);
			
	}
	}
	
	}
class Multithread{
	public static void main(String args[])
		{
		
		MyThread t1 = new MyThread("Ankur");
		MyThread t2 = new MyThread("Debomoy");
		t1.start();
		t2.start();
	
		//t2.setPriority(10);
		
		}
}
