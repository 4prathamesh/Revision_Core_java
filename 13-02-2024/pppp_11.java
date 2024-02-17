// Q 11

public class pppp_11
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=17;j++)
			{
				if(j>=10-i && j<=8+i && j%2==0 && i%2==0)
				{
					System.out.printf("%d ",i);
				}
				else if(j>=10-i && j<=8+i && j%2!=0 && i%2!=0)
				{
					System.out.printf("%d ",i);
				}
				else
				{
					System.out.printf("* ");
				}
			}
			System.out.println();
		}
	}

}