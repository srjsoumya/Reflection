package qspider;
abstract class Print
{
	abstract void display();
}
class NewPrint extends Print
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
class SamePrint extends Print
{
	void display()
	{
	}
	void display(int i)
	{
		System.out.print(i);
	}
	void display(double d)
	{
		System.out.print(d);
	}
	void display(String str)
	{
		System.out.print(str);
	}
	void display(byte b)
	{
		System.out.print(b);
	}
	void display(short s)
	{
		System.out.print(s);
	}
	void display(long l)
	{
		System.out.println(l);
	}
	
}


public class AltPrint {
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
		
		SamePrint sameline=new SamePrint();
		sameline.display("hello");
		sameline.display("hello"+"world");
		sameline.display(56.34);
		sameline.display(8908);
		sameline.display((byte)34);
		sameline.display((short)23);
		sameline.display(1234567891234l);
		sameline.display();
		
				
	}

}
