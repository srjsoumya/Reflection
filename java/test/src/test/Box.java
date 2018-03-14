package test;

public class Box {
	int length;
	int breath;
	int height;
	long volume;
	public Box(int length,int breath,int height)
	{
		this.length=length;
		this.breath=breath;
		this.height=height;
		this.volume=volume();	      //automatic call by constructor
	}
	public long volume()
	{
		long volume=length*breath*height;
		return volume;
	}
	public void display()
	{
		System.out.println(length);
		System.out.println(breath);
		System.out.println(height);
		System.out.println("Volume of box is"+volume);
	}
	public static void display(Box Box)
	{
		System.out.println(Box.length);
		System.out.println(Box.breath);
		System.out.println(Box.height);
		System.out.println("Volume of box is "+Box.volume);
	}
	public static void main(String args[])
	{
		Box fKartBox=new Box(10,15,20);
		Box amzonBox=new Box(20,15,70);
		Box lappiBox=new Box(40,30,60);
		//fKartBox.display();            //Manually call through object
		//amzonBox.display();            //Manually call through object
		//lappiBox.display();            //Manually call through object
		display(fKartBox);
		display(amzonBox);
		display(lappiBox);
		System.out.println("");
		
		
	}
	

}
