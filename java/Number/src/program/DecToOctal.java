package program;

import java.util.Scanner;

public class DecToOctal {
	static long power(int a, int b) {
		long res = 1;
		for (int i = b; i > 0; i--)
			res *= a;
		return res;
	}

	public static void decToOctal(int dec) {
		long oct = 0;
		int rem = 0;
		int cnt = 0;
		while (dec > 0) {
			rem = dec % 8;
			oct = rem * power(10, cnt) + oct;
			cnt++;
			dec /= 8;
		}
			System.out.println(oct);

	}

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a Decimal Number: ");
		int dec = scr.nextInt();
		decToOctal(dec);

		scr.close();

	}
}
