package program;

import java.util.Scanner;

public class HextoDec {
	static int power(int a, int b) {
		int res = 1;
		for (int i = b; i > 0; i--)
			res *= a;
		return res;
	}

	public static long hexToDec(String hex) {
		long dec = 0;
		hex = hex.toUpperCase();
		int cnt = 0;
		for (int i = hex.length() - 1; i >= 0; i--) {
			char ch = hex.charAt(i);
			if (ch == 'F')
				dec += 15 * power(16, cnt);
			else if (ch == 'E')
				dec += 14 * power(16, cnt);
			else if (ch == 'D')
				dec += 13 * power(16, cnt);
			else if (ch == 'C')
				dec += 12 * power(16, cnt);
			else if (ch == 'B')
				dec += 11 * power(16, cnt);
			else if (ch == 'A')
				dec += 10 * power(16, cnt);
			else if (ch == '9')
				dec += 9 * power(16, cnt);
			else if (ch == '8')
				dec += 8 * power(16, cnt);
			else if (ch == '7')
				dec += 7 * power(16, cnt);
			else if (ch == '6')
				dec += 6 * power(16, cnt);
			else if (ch == '5')
				dec += 5 * power(16, cnt);
			else if (ch == '4')
				dec += 4 * power(16, cnt);
			else if (ch == '3')
				dec += 3 * power(16, cnt);
			else if (ch == '2')
				dec += 2 * power(16, cnt);
			else
				dec += 1 * power(16, cnt);
			cnt++;

		}
		return dec;
	}

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a HEXADECIMAL Number: ");
		String hex = scr.next();

		System.out.println(hexToDec(hex));
		scr.close();
	}

}
