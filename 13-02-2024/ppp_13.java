// Q 13
public class ppp_13
{
	public static void main(String x[])
	{
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<=i;j++)
			{
				int res=1;
				if(j>7-i)
				i=7-i;
				for(int k=0;k<i;++k)
				{
					res=res*(i-k);
					res=res/(k+1);
				}
				System.out.printf("%d",res);
			}
			System.out.println();
		}
		
	}
}