// Q 6
import java.util.*;
class Employee
{
	int id,salary;
	String name,designation;
	void setId(int id)
	{
		this.id=id;
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setDes(String designation)
	{
		this.designation=designation;
	}
	void setSal(int salary)
	{
		this.salary=salary;
	}
	int getId()
	{
		return id;
	}
	String getName()
	{
		return name;
	}
	String getDes()
	{
		return designation;
	}
	int getSal()
	{
		return salary;
	}
}
class Company
{
	Employee emp[];	
	Company()
	{
		
	}
	Company(Employee ...emp)
	{
		this.emp=emp;
	}
	void sortEmployee() 
	{
	
		for(int i=0;i<emp.length-1;i++)
		{
			for(int j=i+1;j<emp.length;j++)
			{
				if(emp[i].getSal() < emp[j].getSal())
				{
					Employee temp=emp[i];
					emp[i]=emp[j];
					emp[j]=temp;
				}
			}
		}
	}
	void show()
	{
		for(int i=0;i<emp.length;i++)
		{
			System.out.println("employee id is: "+ emp[i].getId()+"\nemployee name is: "+emp[i].getName()+"\nemployee designation is: "+emp[i].getDes()+"\nemployee salary is: "+emp[i].getSal() );
		}
	}
}

public class AppCompanay_6
{
	public static void main(String x[])
	{
		int id,sal;
		String name,desi;
		Scanner sc = new Scanner(System.in);
		Employee e[]= new Employee[5];
		Company c= new Company();
		System.out.println("enter the employee records");
		for(int i=0;i<e.length;i++)
		{
			e[i]=new Employee();
			System.out.println("enter the employee id");			
			id=sc.nextInt();
		System.out.println("enter the employee name");
			name=sc.next();
		System.out.println("enter the employee desi");
			desi=sc.next();
		System.out.println("enter the employee salary");
			sal=sc.nextInt();
			e[i].setId(id);
			e[i].setName(name);
			e[i].setDes(desi);
			e[i].setSal(sal);
			c=new Company(e);
		}
		c.sortEmployee();
		c.show();
	}
}












