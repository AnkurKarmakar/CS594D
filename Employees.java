class Employees
{
String Name,Designation;
float Salary,Id;


Employees(String n,float s,String d,float i)
{
Name=n;
Salary=s;
Designation=d;
Id=i;
}

public void display()
{
System.out.println("Name " + Name + "Salary " + Salary + "Designation " + Designation + "Id " + Id);
}

public static void main(String args[])
{
Employees e1=new Employees("amit",5000,"peon",11111);

System.out.println(e1.Name);
}
}

