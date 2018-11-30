class Employee
{
String name,designation;
float salary,id;



public String getn()
{return Name;
}

public float  gets()
{return Salary;
}

public String getd()
{return Designation;
}

public float geti()
{return Id;
}

Employee(String n,float s,String d,float i)
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
Employee e1=new Employee("amit",5000,"peon",11111);

System.out.println(e1.Name);
}
}
