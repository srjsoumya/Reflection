package programs;

public class ExampleProgram {
	public static void main(String[] args) {
		int n = 7;
		int[] arr = { 0, 1, 0, 1, 0, 1, 0 };
		int m = 2;
		Boolean flag = false;
		int i = 0;
		int cnt = 0;
		while (i < n) {
			if ((i + 1) == (n)) {
				flag = true;
				break;
			} else if ((i + m) == (n)) {
				flag = true;
				break;
			}
			if (arr[i + 1] == 0) {
				i++;
				if (i == n)
					flag = true;
			} else if (arr[i + m] == 0) {
				i = i + m;
				if (i == n)
					flag = true;
			}
			cnt++;
			if (cnt == 20)
				break;

		}
		if (flag)
			System.out.println("Yes:  There is a path");
		else
			System.out.println("No: There is no path");

	}

}
