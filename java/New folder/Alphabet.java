public class Alphabet
{
	public static void main(String args[] )
	{
		int i=1,j=1,k;
		char c= 'A';
		char fin='Z';
		while(j<=i && c<=fin)
		{
			for(j=1;j<=i && c<=fin;j++)
			{
				System.out.print(c++);
			}
			System.out.println();
			i++;
		}
	}
}
