import java.util.Scanner;
class WrongAge extends Exception
{
	WrongAge(String s)
	{
		super(s);
	}
}
class inputscanner
{
	Scanner s;
	inputscanner()
	{
		s=new Scanner(System.in);
	}
}
class Father extends inputscanner
{
	int fatherAge;
	Father() throws WrongAge
	{
		System.out.println("Enter the age of the Father.");
		fatherAge=s.nextInt();
		if(fatherAge<0)
		{
			throw new WrongAge("Age cannot be negative.");
		}
	}
	void display()
	{
		System.out.println("The father's age is "+fatherAge);
	}
}
class Son extends Father
{
	int sonAge;
	Son() throws WrongAge
	{
		System.out.println("Enter the age of the son.");
		sonAge=s.nextInt();
		if(sonAge>fatherAge)
		{
			throw new WrongAge("Son's age cannot be greater than father's age");
		}
		else if(sonAge<0)
		{
			throw new WrongAge("Age cannot be negative");
		}
	}
	void display()
	{
		System.out.println("The son's age is "+sonAge);
	}
}
class Main
{
	public static void main(String args[])
	{
		System.out.println("Creating a Father class object.");
		try
		{
			Father fatherobject=new Father();
			fatherobject.display();
		}
		catch(WrongAge e)
		{
			System.out.println(e);
		}
		System.out.println("Creating a Son class object.");
		try
		{
			Son sonobject=new Son();
			sonobject.display();
		}
		catch(WrongAge e)
		{
			System.out.println(e);
		}
	}
}
		
		