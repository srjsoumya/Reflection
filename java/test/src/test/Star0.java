package test;

public class Star0 {
	public static void main(String args[])
	{
		int no=6;
		int i,j;
		for(i=no;i>=1;i--)
		{
			for(j=1;j<=no-i;j++)
				System.out.print(" ");
			for(j=2*i-1;j>=1;j--)
				System.out.print("*");
			System.out.println();
		}
		for(i=2;i<=no;i++)
		{
			for(j=1;j<=no-i;j++)
				System.out.print(" ");
			for(j=1;j<=i*2-1;j++)
				System.out.print("*");
			System.out.println();
		}
		
		
	}

}
