// Q 4
import java.util.*;
class Animal
{
	int sleep;
	String eat;
	Animal(int sleep,String eat)
	{
  		this.sleep=sleep;
		this.eat=eat;
	}
	void propartic()
	{
		System.out.println("all animal are eat and sleep");
	}
}
class Dog extends Animal
{
	Dog(int sleep,String eat)
	{
		super(sleep,eat);
	}
	void propartic()
	{
		System.out.println("all animal are eat and sleep: "+eat +" and "+ sleep +" bark and breed");

	}
}
public class AppAnimal_4
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the sleep time and eat");
		int sleep=sc.nextInt();
		String eat=sc.next();
		Animal a= new Dog(sleep,eat);
		a.propartic();
	}
}