public class Rectangle
{
	int l;
	int b;
	String color;
	public Rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public Rectangle(int l,int b,String color)
	{
	    this(l,b);
		this.color=color;
	}
	public static void main(String args[])
	{
		Rectangle r1=new Rectangle(5,6,"red");
		Rectangle r2=new Rectangle(8,9);
		r1.display();
		r2.display();
	}
	public void display()
	{
		System.out.println(l);
		System.out.println(b);
		if (color!=null)
			System.out.println(color);	
	}
}
