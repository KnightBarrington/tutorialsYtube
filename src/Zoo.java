
public class Zoo {

	public static void main(String[] args) {
		Animals animal1 = new Animals(12,"M" , 23);
		
		animal1.eat();
		Chicken chick1 = new Chicken( 1, "M" , 8);
		chick1.Fly();
		Sparrow sparrow1 = new Sparrow(2, "M" , 7);
		sparrow1.Fly();
		
		
		Bird bird1 = new Bird(4, "F", 10);
		bird1.Fly();
		bird1.eat();
		bird1.sleep();
	}
}
