package test;

public class Factorial {
	public static int fact(int i)
	{
		int result=i;
		if(i==1) return 1;
		result=result*fact(i-1);
		return result;
			
		
	}
	public static void main(String args[])
	{
		int i=8,j;
		j=fact(i);
		System.out.println(j);
		
	}

}
