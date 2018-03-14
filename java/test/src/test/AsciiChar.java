package test;

public class AsciiChar {
	public static void main(String []args) 
	{
		for(int i=0;i<=127;i++)
		{
			char c=(char)i;
			System.out.print(i+"="+c);
			System.out.println();
		}
	}

}
