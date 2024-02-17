//Q 1
import java.util.*;
class Rectangle
{
	int len,bre;
	Rectangle()
	{
		len=0;
		bre=0;
	}
	Rectangle(int len , int bre)
	{
		this.len=len;
		this.bre=bre;
	}
	Rectangle(int num)
	{
	   	len=num;
		bre=num;	
	}
	void calcArea()
	{
		System.out.println("area of Rectangle: "+len*bre);
	}
}


public class AppRectangle_1
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the length and breadth");
		int len=sc.nextInt();
		int bre=sc.nextInt();
		
		Rectangle r= new Rectangle(len,bre);
		r.calcArea();
	}
}











