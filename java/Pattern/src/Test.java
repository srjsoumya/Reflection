
 class Test1
{
	static int i=10;
	public void run()
	{
		display();
		int j=50;
		System.out.println("in run");
		System.out.println(i);
		System.out.println(j);
	}
	public void display()
	{
		System.out.println("in display");
	}
	
	public static void main(String[] args)
	{
		Test1 t1=new Test1();
		t1.run();
		i=40;
		System.out.println(i);
		Test1 t2=new Test1();
		t2.display();
		t2.run();
	}
}
