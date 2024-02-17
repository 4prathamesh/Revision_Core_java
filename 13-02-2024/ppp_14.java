// Q 14

public class ppp_14
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=6-i)
				{
					System.out.printf("%d",j);
				}
				else
				{
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
	}
}