package qspider;

public class TestProgram {
	static int i=10;
	char c='A';
	static int display(int k)
	{
		k+=100;
		return k;
	}
	/*void view()
	{
		System.out.println(c);
	}*/
	public static void main(String []args)
	{
		int i=100;
		int j;
		System.out.println(i);
		System.out.println(TestProgram.i);		
		//TestProgram tp=new TestProgram();
		//tp.view();
		j=display(1000);
		System.out.println(j);
		System.out.println("\"HAPPY\"");
	}

}
