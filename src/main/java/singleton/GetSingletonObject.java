package singleton;

public class GetSingletonObject {

	public static void main(String[] args) {
		Singleton singletonObject = Singleton.getInstance();
		singletonObject.showType();
	}
}
