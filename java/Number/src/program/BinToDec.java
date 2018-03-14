package program;

import java.util.Scanner;
/**
 * 
 * @author SONYVAIO
 *
 */

public class BinToDec {
	static int power(int a, int b) {
		int res = 1;
		for (int i = b; i > 0; i--)
			res *= a;
		return res;
	}
/**
 * @param binary
 * @return Take  binary number and return decimal number
 */
	public static int binToDec(int binary) {
		int dec = 0;
		int cnt = 0;
		int rem = 0;
		while (binary > 0) {
			rem = binary % 10;
			dec = dec + rem * power(2, cnt);
			binary /= 10;
			cnt++;
		}
		return dec;
	}

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a Binary Number: ");
		int bin = scr.nextInt();

		System.out.println(binToDec(bin));
		scr.close();
	}

}
