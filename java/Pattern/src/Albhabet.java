import java.util.Scanner;

public class Albhabet {
		public static void main(String args[] )
		{
			int i=1,j=1;
			int c=1;//char c= 'A';
			int fin;//char fin='Z';
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter final number :");
			fin=sc.nextInt();
			
			while(j<=i && c<=fin)
			{
				for(j=1;j<=i && c<=fin;j++)
				{
					System.out.print("*");
					c++;
				}
				System.out.println();
				i++;
			}
			sc.close();
		}
	}

