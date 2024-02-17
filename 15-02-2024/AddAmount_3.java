// 3 Q
import java.util.*;
class AddAmount
{
	int amo;
	AddAmount()
	{
		amo=50;
	}
	AddAmount(int amo)
	{	
		this.amo=amo;
	}
	void display()
	{
		System.out.println("total: "+(amo+50));
	}
}
public class AddAmount_3
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the amount");
		int amo=sc.nextInt();
		AddAmount a= new AddAmount(amo);
		a.display();
	}
}