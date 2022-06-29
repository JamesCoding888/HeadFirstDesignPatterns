package chapter01;

import org.junit.jupiter.api.Test;

public class MallarDuck extends Duck{
	@Test
	public void mainTest() {
		new MallarDuck();
	}
	
	public MallarDuck() {
		quackBehavior = new Duck();
		quackBehavior.display();
	}
}
