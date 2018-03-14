public class Star
{
	public static void main(String args[])
	{
		int i,j,no=7;
		for(i=no;i>=1;i--)
		{
			for(j=0;j<=no-i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=2;i<=no;i++)
		{
			for(j=no-i;j>=0;j--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
