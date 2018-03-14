package demo;

class Singleton {
	String str;

	private static Singleton single = null;

	private Singleton() {
		str = "Singleton Example";
	}

	public static Singleton getInstance() {
		if (single == null)
			single = new Singleton();

		return single;
	}
}

public class SingletonTest {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.str);
		System.out.println(s2.str);
		System.out.println(s3.str);

	}

}
