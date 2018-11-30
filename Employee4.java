class Employee4{

//Data member
private static int count =0000000 ;
private int emp_id;
public String emp_name;
public double salary;
private String designation;
static String company_name;
static String company_rating;



static 
{

company_name="BPPIMT";
company_rating="9.0";

}

//Methods


{
count++; //nonstatic method
}

// Default constructor
Employee4()
{
	designation= "Fresher";
	salary=25000;
	emp_id=count;
}



public static void  display(){
	System.out.println("Comapany_Name : "+ company_name+ " Company_rating : " +company_rating+" Total no. of employee :  "+ count );
}

public static void main(String args[]){
 
 Employee4 e =new Employee4();
 Employee4.display();


}
}
