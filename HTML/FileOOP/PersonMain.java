import java.util.*;
public class PersonMain
{
	public static void main(String [] args)
		{
			Scanner scan = new Scanner(System.in);
			//object declaration
			Person2 p1 = new Person2();
						//object creation
			p1.name = "John";
			p1.address = "Cebu City";
			p1.age = 40;
			p1.eat("Banana");
			p1.play("Guitar");
			p1.display();

			Person2 p2 = new Person2();
			p2.name = "Peter";
			p2.address = "Mandaue";
			p2.age = 25;
			p2.eat("Cookies");
			p2.play("Drum");
			p2.display();

			Person2 p3 = new Person2();
			p3.name = "Robert";
			p3.address = "Colon Cebu";
			p3.age = 16;
			p3.eat("Salad");
			p3.play("Bass");
			p3.display();


			System.out.print("Name:");
			String name = scan.nextLine();
			System.out.print("\nAddress:");
			String address = scan.nextLine();
			System.out.print("Age:");
			int age = scan.nextInt();

			Person2 person4 = new Person2(name, address, age);

			person4.eat("Vegetables");
			person4.play("Violin");
			person4.display();

			Person2 p5 = new Person2("Kevin", "Hongkong", 31);
			p5.eat("PIZZA");
			p5.play("Mobile Legend");
			p5.display();
			
			
			Scanner scans = new Scanner(System.in);
			System.out.println("what is your name?");
			String name2 = scans.nextLine();
			System.out.println("where do you live?");
			String address2 = scans.nextLine();
			System.out.println("how old are you?");
			int age2 = scans.nextInt();

			Person2 p6 = new Person2(name2, address2, age2);

			p6.eat("chocolate");
			p6.play("DOTA2 ");
			p6.display();
	}
}