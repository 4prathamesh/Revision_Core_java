// Q 10

import java.util.*;

public class transpose_10
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		int a[][] = new int[2][2];
		System.out.println("enter the array element");
		for(int i=0;i<2;i++)
		{	
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("befor transpose");
		for(int i=0;i<2;i++)
		{	
			for(int j=0;j<2;j++)
			{
				System.out.printf("%d",a[i][j]);
			}
			System.out.println();
		}
		System.out.println("after transpose");
		for(int i=0;i<2;i++)
		{	
			for(int j=0;j<2;j++)
			{
				System.out.printf("%d",a[j][i]);
			}
			System.out.println();
		}
	}
}