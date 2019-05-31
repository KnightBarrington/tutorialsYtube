
public class Human {

	String name;
	int age;
	int heightInInches;
	String eyecolour;
	String food;
	String eat;
	int work;
	int style;
	

	public Human() 
	{
		
	}
	
	public void speak() {
		System.out.println("Hello, My name is " + name);
		System.out.println("I am " + heightInInches + " inches tall");
		System.out.println("I am " + age + " years old");
		System.out.println("My eye colour is " + eyecolour);
	}
	
	public void eat() {
		System.out.println("Walking......");
		System.out.println("I am going to walk to the store to get some "+ food + " Im soo Hungry right now...");
		System.out.println("Do not Disturb me!!, " + eat + ".");
		System.out.println("Aye, That tasted Fireeeeeeee!!");
		System.out.println("Im full, i may have eatten too much!?.....");
		
	}
	
	
	public void work() {
		System.out.println("Working.... Currently....");
		System.out.println( "I am Working Until " + work);
		System.out.println("There are a few Hot girls at my job and they know who I am, Ayeeee im going to ask for their numbers to talk to them " + style + " pts Achieved !!!!! ");
	}
	
	
	
}

