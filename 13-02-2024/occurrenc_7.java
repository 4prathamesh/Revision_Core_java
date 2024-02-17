// Q 7
 import java.util.*;

public class occurrenc_7
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]= new int[10];
		System.out.println("enter the array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==0)
			{
				count++;
			}
			
		}		
		System.out.println("0 is occers "+count);
		for(int i=0;i<a.length-1;i++)
		{
			count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=0;
					count++;
				}
			}
			if(a[i]!=0)
			System.out.println(a[i]+" is occers "+count);
		}
	}
}