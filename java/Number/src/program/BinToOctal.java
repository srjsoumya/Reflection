package program;

import java.util.Scanner;

public class BinToOctal {
	static int power(int a, int b) {
		int res = 1;
		for (int i = b; i > 0; i--)
			res *= a;
		return res;
	}

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a binary Number: ");
		int bin = scr.nextInt();
		int dec = 0;
		int cnt = 0;
		int rem = 0;
		while (bin > 0) {
			rem = bin % 10;
			dec = dec + rem * power(2, cnt);
			bin /= 10;
			cnt++;

		}
		System.out.println(dec);
		scr.close();
	}

}
