// Q 6
import java.util.*;

public class rotate_arr_n_6
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("enter the array element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("enter the position for rotate array");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int temp=arr[0];
			for(int j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=temp;
		}

		System.out.println("rotate array is");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}