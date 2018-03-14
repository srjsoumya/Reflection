package test;

public class Star000 {
	public static void main(String args[])
	{
		int no=5;
		int i,j;
		for(i=1;i<=no;i++)
		{
			for(j=1;j<=no-i;j++)
				System.out.print(" ");
			for(j=1;j<=no*2-1;j++)
				System.out.print("*");
			System.out.println();
		}
		for(i=no-1;i>=1;i--)
		{
			for(j=1;j<=no-i;j++)
				System.out.print(" ");
			for(j=1;j<=no*2-1;j++)
				System.out.print("*");
			System.out.println();
		}
		
	}

}
