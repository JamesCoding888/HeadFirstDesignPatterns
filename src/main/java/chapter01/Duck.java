package chapter01;

public class Duck implements QuackBehavior{
	QuackBehavior quackBehavior;
	@Override
	public void display() {
		System.out.println("I'm a real MallarDuck~");
	}
	
	
}
