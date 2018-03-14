package number;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter The Number To Check: ");
		int no = scr.nextInt();
		int temp = no;
		int rem, res = 0;

		String str = Integer.toString(no);
		int length = str.length();
		while (no > 0) {
			rem = no % 10;
			res += (int) Math.pow(rem, length);
			no = no / 10;

		}
		if (res == temp)
			System.out.println("Number is Amstrong");
		else
			System.out.println("Number is not Amstrong");

		scr.close();

	}

}
