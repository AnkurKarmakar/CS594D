class Employee2{

//Data member
private static int count =0000000 ;
private int emp_id;
private String emp_name;
private double salary;
public String designation;

//Methods


{
count++; //nonstatic method
}

// Default constructor
Employee2()
{
	designation= "temporary";
	salary=25000;
	emp_id=count;
}
Employee2(String m_name)
	{
	emp_name=m_name;
	designation= "fresher";
	salary=25000;
	emp_id=count;
	}

Employee2(String m_name, String m_designation, double m_salary)
	{
	emp_name=m_name;
	designation= m_designation;
	salary=m_salary;
	emp_id=count;
	}

public void increase_salary(double r){
	salary= (r*salary)/100 +salary;
}

public void increase_salary(int b){
	salary= b +salary;
}

public void increase_salary(double r,double b){
	salary= (r*salary)/100 + salary + b;
}



public void display(){
	System.out.println("Name : " +emp_name+ " Employee id : " +emp_id+ " Salary :  "+ salary+ " Designation : " + designation );
}

public static void main(String args[]){

/*	Employee emp1 = new Employee();
	Employee emp2 = new Employee("Debomoy");
	Employee emp3 = new Employee("Gaurav", "CEO", 5000000);
*/

	
	Employee2 emp[]=new Employee2[3];
	emp[0] =new Employee2();
	emp[1] =new Employee2("Gaurav");
	emp[2] =new Employee2("Debomoy", "executive", 5000000);
	
	for(Employee2 e:emp)
		e.display();
	
	
	
	int bonus = 10000;
	double rate = 10.00;
	
	for(Employee2 e:emp)
	{
		if(e.designation=="Fresher")
		e.increase_salary(rate);
		else if(e.designation=="temporary")
		e.increase_salary(bonus);
		else
		e.increase_salary(rate,bonus);
		
	}	
	/*emp[0].increase_salary(10.00);
	emp[1].increase_salary(100000);
	emp[2].increase_salary(10,10000);
	
	*/	
		
	for(Employee2 e:emp)
		e.display();
	/*emp1.display();
	emp2.display();
	emp3.display();
*/	

}
}
