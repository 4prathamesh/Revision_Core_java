// 15 Q
public class ppp_15
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			int p=1;
			for(int j=1;j<=9;j++)
			{
				if(j>=6-i && j<=4+i)
				{
					System.out.printf("%d",p);
					if(j>5)
					{
						--p;
					}
					else
					{
						++p;
					}
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