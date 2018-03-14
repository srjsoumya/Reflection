package programs;

class NewPrint 
{
	void display()
	{
		System.out.println();
	}
	void display(int i)
	{
		System.out.println(i);
	}
	void display(double d)
	{
		System.out.println(d);
	}
	void display(String str)
	{
		System.out.println(str);
	}
	void display(byte b)
	{
		System.out.println(b);
	}
	void display(short s)
	{
		System.out.println(s);
	}
	void display(long l)
	{
		System.out.println(l);
	}
}
public class TestOverload {
	public static void main(String []args)
	{
        NewPrint newline=new NewPrint();
		newline.display("hello");
		newline.display("hello"+"world");
		newline.display(56.34);
		newline.display(8908);
		newline.display((byte)34);
		newline.display((short)23);
		newline.display();
		newline.display(1234567891123l);				
	}

}

