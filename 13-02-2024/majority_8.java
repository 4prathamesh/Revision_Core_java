// Q 8
import java.util.*;

public class majority_8
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the array size");
		int size=sc.nextInt();
		int a[]= new int[size];
		System.out.println("enter the array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int maj=0,count;
		boolean flag=false;
		for(int i=0;i<a.length-1;i++)
		{	
			count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>=a.length/2)
			{
				maj=a[i];
				flag=true;
			}
		}
		if(flag)
		{
			System.out.println("majority element is "+maj);
		}
		else
		{
			System.out.println("no majority element in array ");
		}
	}
}