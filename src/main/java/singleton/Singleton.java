package singleton;

public class Singleton {

	private static Singleton singleton = new Singleton();

	private Singleton() {}

	public static Singleton getInstance() {
		return singleton;
	}

	public void showType() {
		System.out.println("This is a singleton class");
	}
}
