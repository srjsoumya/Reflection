import java.util.Scanner;

public class SpacePattern {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int no = scr.nextInt();
		int i, j;
		for (i = 1; i <= no; i++) {
			int cnt = 1;
			for (j = no; j >= i; j--) {
				System.out.print("  ");
			}
			for (j = 1; j <= (2 * i - 1); j++) {
				if (j < i)
					System.out.print(cnt++ + " ");
				else if (i == no && j == no) {
					System.out.print("  ");
					cnt--;
				} else
					System.out.print(cnt-- + " ");
			}
			System.out.println();
		}
		for (i = no - 1; i >= 1; i--) {
			int cnt = 1;
			for (j = 0; j <= no - i; j++) {
				System.out.print("  ");
			}
			for (j = 1; j <= (2 * i - 1); j++) {
				if (j < i)
					System.out.print(cnt++ + " ");
				else
					System.out.print(cnt-- + " ");
			}
			System.out.println();
		}
		scr.close();
	}

}
