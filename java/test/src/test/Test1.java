package test;

public class Test1 {
	int a=600;
	static int b=50;
	
	public static void run()
	{
		System.out.println("In run");
		System.out.println(b);
		
	}
	public void display()
	{
		b=70;
		System.out.println("In display");	
		run();
		System.out.println(b);
	}
	public static void main(String args[])
	{
		b=60;
		Test1 t1=new Test1();
		t1.display();
		System.out.println(t1.a);
		System.out.println(b);
		run();	
	}
}
