import java.util.*;

public class Person2
{
	// attributes
	String name, address, food, instrument;
	int age;

	// default constructor
	public Person2()
	{
		this.name = "Pedro";
		this.address = "Talisay";
		this.age = 55;
	}

	public Person2(String nam, String addr, int ag)
	{
		this.name = nam;
		this.address = addr;
		this.age = ag;
	}

	public void display()
	{
		System.out.println("Name: " +name);
		System.out.println("Address: " +address);
		System.out.println("Age: " +age);
		System.out.println(name + " eats  " +eat(food));
		System.out.println(name + " plays " +play(instrument));
	}

	public String eat(String fd)
	{
		return this.food = fd;
	}

	public String play(String inst)
	{
		return this.instrument = inst;
	}


}