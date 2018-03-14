package test;

public class Test123 {
	static int a;
	static int i=100;
	public static void main(String args[])
	{
		int i=10;
		System.out.println("i= "+i);//to show local variable
		System.out.println("a= "+a);//to show data member
		//System.out.println(j); CTE due to j is in run method
		run();
	}
	public static void run()
	{
		int j=30;
		int i=100;
		System.out.println("i= "+i); //CTE Because i is in main method
		System.out.println("a= "+a);//to show data member
		System.out.println("j= "+j);//to show local variable
	}

}
