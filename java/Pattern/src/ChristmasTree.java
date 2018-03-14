import java.util.Scanner;

public class ChristmasTree {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a odd number more than 7 : ");
		int no = scr.nextInt();
		int i, j;
		for (i = 1; i <= no; i++) {
			for (j = no; j >= i; j--) {
				System.out.print(" ");
			}
			for (j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 1; i <= no - 4; i++) {
			if (i < no - 4) {
				for (j = 1; j <= no - 2; j++)
					System.out.print(" ");
				for (j = 1; j <= 5; j++)
					System.out.print("*");
				System.out.println();
			} else {
				for (j = 1; j <= no - 5; j++)
					System.out.print(" ");
				for (j = 1; j <= 11; j++)
					System.out.print("*");
				System.out.println();
			}
		}
		scr.close();
	}

}
