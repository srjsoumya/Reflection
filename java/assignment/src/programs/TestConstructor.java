package programs;
class Box 
{
	int length;
	int breath;
	int height;
	public Box(int length,int breath,int height)
	{
		this.length=length;
		this.breath=breath;
		this.height=height;
	}
	public void display()
	{
		System.out.println("Length of Box :"+length);
		System.out.println("Breath of Box :"+breath);
		System.out.println("Height of Box :"+height);
	}
}	
public class TestConstructor
{
public static void main(String args[])
	{
		Box box1=new Box(10,15,20);
		Box box2=new Box(20,15,70);
		Box box3=new Box(40,30,60);
		box1.display();
		System.out.println();
		box2.display();
		System.out.println();
		box3.display();		
	}
}
	

