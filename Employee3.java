class Employee3{

//Data member
private static int count =0000000 ;
private int emp_id;
public String emp_name;
public double salary;
private String designation;

//Methods


{
count++; //nonstatic method
}

// Default constructor
Employee3()
{
	designation= "Fresher";
	salary=25000;
	emp_id=count;
}
Employee3(String m_name)
	{
	emp_name=m_name;
	designation= "Fresher";
	salary=25000;
	emp_id=count;
	}

Employee3(String m_name, String m_designation, double m_salary)
	{
	emp_name=m_name;
	designation= m_designation;
	salary=m_salary;
	emp_id=count;
	}

public void compare(Employee3 e){
	if(this.salary > e.salary)
		System.out.println(this.emp_name + " has more salary");
	else
		System.out.println(e.emp_name + " has more salary");
}



public void display(){
	System.out.println("Name : " +emp_name+ " Employee id : " +emp_id+ " Salary :  "+ salary+ " Designation : " + designation );
}

public static void main(String args[]){

/*	Employee emp1 = new Employee();
	Employee emp2 = new Employee("Debomoy");
	Employee emp3 = new Employee("Gaurav", "CEO", 5000000);
*/

	
	Employee3 emp[]=new Employee3[3];
	emp[0] =new Employee3();
	emp[1] =new Employee3("Gaurav");
	emp[2] =new Employee3("Debomoy", "CEO", 5000000);
	
	for(Employee3 e:emp)
		e.display();
		
		
	emp[1].compare(emp[2]);
		
		
		
	/*emp1.display();
	emp2.display();
	emp3.display();
*/	

}
}
