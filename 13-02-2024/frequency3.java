// Q 3
import java.util.*;

public class frequency3
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number ");
		int num=sc.nextInt();
		int one=0,two=0,three=0,four=0,five=0,six=0,seven=0,eight=0,nine=0,zero=0;
		while(num!=0)
		{
			int rem=num%10;
			switch(rem)
			{
				case 1:
					one++;
				break;
				case 2:
					two++;
				break;
				case 3:
					three++;
				break;
				case 4:
					four++;
				break;
				case 5:
					five++;
				break;
				case 6:
					six++;
				break;
				case 7:
					seven++;
				break;
				case 8:
					eight++;
				break;
				case 9:
					nine++;
				break;
				case 0:
					zero++;
				break;
			}
			num=num/10;
		}
		System.out.println("one is "+one);
		System.out.println("two is "+two);
		System.out.println("three is "+three);
		System.out.println("four is "+four);
		System.out.println("five is "+five);
		System.out.println("six is "+six);
		System.out.println("seven is "+seven);
		System.out.println("eight is "+eight);
		System.out.println("nine is "+nine);
		System.out.println("zero is "+zero);

		
	}
}