public class Pattern
{
	public static void main(String args[])
	{
		int i,j,no=7;
		for(i=1;i<=no;i++)
		{
			for (j=no;j>=i;j--)
			{
				System.out.print("&");
			}
			for(j=1;j<=(2*i-1);j++)
			{
				System.out.print(" ");
			}
			for (j=no;j>=i;j--)
			{
				System.out.print("&");
			}
			System.out.println();
		}
		for(i=no-1;i>=1;i--)
		{
			for (j=0;j<=no-i;j++)
			{
				System.out.print("&");
			}
			for(j=1;j<=(2*i-1);j++)
			{
				System.out.print(" ");
			}
			for (j=0;j<=no-i;j++)
			{
				System.out.print("&");
			}
			System.out.println();
		}
	}
}
