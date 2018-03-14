package program;

import java.util.Scanner;

public class DecToBin {
	static long power(int a, int b) {
		long res = 1;
		for (int i = b; i > 0; i--)
			res *= a;
		return res;
	}

	public static void decToBin(int dec) {
		long bin = 0;
		int rem = 0;
		int cnt = 0;
		while (dec > 0) {
			rem = dec % 2;
			bin = rem * power(10, cnt) + bin;
			cnt++;
			if (cnt == 20)
				break;
			dec /= 2;
		}
		if (cnt == 20) {
			System.out.println("Value is out of range");
		} else
			System.out.println(bin);
		;

	}

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a Decimal Number: ");
		int dec = scr.nextInt();
		decToBin(dec);

		scr.close();

	}

}
