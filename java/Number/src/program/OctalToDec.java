package program;

import java.util.Scanner;

public class OctalToDec {
	static int power(int a, int b) {
		int res = 1;
		for (int i = b; i > 0; i--)
			res *= a;
		return res;
	}

	public static int octToDec(int oct) {
		int dec = 0;
		int cnt = 0;
		int rem = 0;
		while (oct > 0) {
			rem = oct % 10;
			dec = dec + rem * power(8, cnt);
			oct /= 10;
			cnt++;
		}
		return dec;
	}

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a Octal Number: ");
		int oct = scr.nextInt();

		System.out.println(octToDec(oct));
		scr.close();
	}

}
