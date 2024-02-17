// Q 5
import java.util.*;
class Vehicle
{
	String color;
	int model,year;
	Vehicle(String color, int model,int year)
	{
		this.color=color;
		this.model=model;
		this.year=year;
	}
	
}
class Car extends Vehicle
{
	int nDoors;
	Car(String color, int model,int year,int nDoors)
	{
		super(color, model,year);
		this.nDoors=nDoors;
	}
	void displayInfo()
	{
		System.out.println("car color is: "+color+"\ncar model is: "+model+"\nyear is: "+year+"\nnumber of Doors: "+nDoors);
	}
}
public class AppVehicle_5
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		String color;
		int model,year;
		int nDoors;
		System.out.println("enter the color, model, year, nDoors");
		color=sc.next();
		model=sc.nextInt();
		year=sc.nextInt();
		nDoors=sc.nextInt();
		Car v= new Car(color, model, year, nDoors);
		v.displayInfo();
	}
}
