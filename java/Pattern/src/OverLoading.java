public class OverLoading {
	static public int add(int i, int j) {
		int k;
		k = i + j;
		return k;
	}

	public static double add(double i, double j) {
		double k;
		k = i + j;
		return k;
	}

	public static float add(float i, float j) {
		float k;
		k = i + j;
		return k;
	}

	public static void main(String[] args) {
		int a;
		float b;
		double c;
		a = add(5, 6);
		b = (float) add(5.6, 6.6);
		c = add(5.66666, 5.888);
		System.out.println(a + " " + b + " " + c);

	}
}
