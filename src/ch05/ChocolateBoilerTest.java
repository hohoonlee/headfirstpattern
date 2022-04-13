package ch05;

public class ChocolateBoilerTest {
	public static void main(String[] args) {
		ChocolateBoiler instance = ChocolateBoiler.newInstance();
		System.out.println("00" + instance);
		instance.fill();
		System.out.println("10" + instance);
		instance.boid();
		System.out.println("20" + instance);
		instance.drain();
		System.out.println("30" + instance);

		ChocolateBoilerEnum instance0 = ChocolateBoilerEnum.INSTANCE;
		System.out.println("00" + instance0);
		instance0.fill();
		System.out.println("10" + instance0);
		instance0.boid();
		System.out.println("20" + instance0);
		instance0.drain();
		System.out.println("30" + instance0);
	}

}
