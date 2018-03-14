package program;

import java.util.Scanner;

public class DecToHex {
	static long power(int a, int b) {
		long res = 1;
		for (int i = b; i > 0; i--)
			res *= a;
		return res;
	}

	public static String decToHex(int dec) {
		String hex = "";
		int rem = 0;
		while (dec > 0) {
			rem = dec % 16;
			if (rem == 10)
				hex = 'A' + hex;
			else if (rem == 11)
				hex = 'B' + hex;
			else if (rem == 12)
				hex = 'C' + hex;
			else if (rem == 13)
				hex = 'D' + hex;
			else if (rem == 14)
				hex = 'E' + hex;
			else if (rem == 15)
				hex = 'F' + hex;
			else
				hex = rem + hex;

			dec /= 16;
		}
		return hex;

	}

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a Decimal Number: ");
		int dec = scr.nextInt();

		System.out.println(decToHex(dec));

		scr.close();

	}
}
