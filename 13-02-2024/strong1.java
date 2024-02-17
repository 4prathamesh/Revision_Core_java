//  Q 1
import java.util.*;

public class strong1
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number ");
		int num=sc.nextInt();
		int temp=num;
		int fact,sum=0;
		while(temp!=0)
		{
			int rem=temp%10;
			fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;

			temp=temp/10;

		}
		if(sum==num)
		{
			System.out.println("strong number");
		}
		else
		{
			System.out.println("not strong number");
		}
	}
}