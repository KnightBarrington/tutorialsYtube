
public class Fish extends Animals {

	
	private String male;

	public Fish(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs);
		
		
		Fish.this.age = 2;
		Fish.gender = male;
		Fish.this.weightInLbs = 30;
	
		
	}

	public void swim() {
		System.out.println("Just Keep Swimming.....");
	}
}
