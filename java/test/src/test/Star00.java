package test;

public class Star00 {
	public static void main(String args[])
	{
		int no=7;
		int i,j;
		for(i=1;i<=no;i++)
		{
			for(j=1;j<=no-i;j++)
				System.out.print(" ");
			for(j=1;j<=i*2-1;j++)
				System.out.print("*");
			System.out.println();
		}
		for(i=no-1;i>=1;i--)
		{
			for(j=1;j<=no-i;j++)
				System.out.print(" ");
			for(j=1;j<=i*2-1;j++)
				System.out.print("*");
			System.out.println();
		}
		
	}

}
