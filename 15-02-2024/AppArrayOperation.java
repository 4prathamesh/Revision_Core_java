// Q 7
/* 7) WAP create class name as ArrayOperation with method name as PerformOperation(int []) And
its extends classes given below:
In above example we define the interface name as ArrayOperation with method
performOperation(int[]) meaning is we can perform the operation on array but we cannot mention
which operation depending on child implementor classes
Means we can extends the interface in Sorting class and extends the ArrayOperation and write the
sorting logics in performOperation() method ---
In Insertion class implement the Interface ArrayOperation and override the ArrayOperation method
in it but before that we need to call the setValue() method in this method can pass the index and
value as two parameter for insert the value on specified index And so on ---
Lastly we need to create 
the Main Method class name as ArrayInfOperationApp
When we press the 1 then call the Sorting logics and when we press the 2 then call the Insert value
on specified index in array when we press the 3 then call the Deletion element from array logics and
when we press 4 then perform array reverse operation
*/
import java.util.*;

interface ArrayOperation
{
	void performOperation(int arr[]);
}
class Sorting implements ArrayOperation
{
	public void performOperation(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;		
				}

			}
		}
		System.out.println("sort arrya is: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
}
class Insertion implements ArrayOperation
{
	int index,value;
	void setValue(int index,int value)
	{
		this.index=index;
		this.value=value;
	}
	public void performOperation(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(i==index)
			{
				for(int j=arr.length-1;j>i;j--)
				{
					arr[j]=arr[j-1];
				}
				arr[index]=value;
			}
		}
		System.out.println("value insert arrya is: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}

class Deletion implements ArrayOperation
{
	void setValue(int value)
	{
		this.value=value;
	}
	public void performOperation(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			if(value==arr[i])
			{
				arr[i]=arr[i+1];
			}
		}
		System.out.println("value insert arrya is: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}	
	}
}

public class AppArrayOperation
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		int arr[]= new int[size];
		int arr1[]= new int[size];
		
		System.out.println("1. sort array ");
		System.out.println("2. insert element");
		System.out.println("3. Deletion element");
		System.out.println("4. reverce element");

		System.out.println("enter the choice");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				ArrayOperation aa= new Sorting();

				System.out.println("enter the array element");
				for(int i=0;i<arr.length;i++)
				{
					arr[i]=sc.nextInt();
				}

				aa.performOperation(arr);
			break;
			case 2:
				System.out.println("enter the index and value");
				int index= sc.nextInt();
				int value= sc.nextInt();
				System.out.println("enter the array element");
				for(int i=0;i<arr1.length-1;i++)
				{
					arr1[i]=sc.nextInt();
				}
				Insertion in= new Insertion();
				in.setValue(index,value);
				in.performOperation(arr1);
			break;
			case 3:
				System.out.println("enter the value");
				int value= sc.nextInt();
				Deletion d= new Deletion();
				d.setValue(value);
				d.performOperation(arr);
			break;
		}
	}
}

















