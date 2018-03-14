
public class Albhabet2 {
	public static void main(String args[] )
	{
		int i=1,j=1,k=1,n=15;
		int c=1;//char c= 'A';
		int fin=150;//char fin='x';
		while(k<=i && c<=fin)
		{
			for(int z=n;z>=1;z--)
				System.out.print(" ");
			for(j=1;j<=2*i-1 && c<=fin;j++)
			{
				System.out.print("*");
				c++;
			}	
			n--;
			System.out.println();
			i++;
			k++;
		}
	}

}
