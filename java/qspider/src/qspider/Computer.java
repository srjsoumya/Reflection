package qspider;

public class Computer {
	String cName;
	String os;
	int ram;
	public Computer(String cName,String os,int ram )
	{
		this.cName=cName;
		this.os=os;
		this.ram=ram;
		this.display();
	}
	public void display()
	{
		System.out.println(cName);
		System.out.println(os);
		System.out.println(ram);
	}
	public static void main(String []args)
	{
		Computer c1=new Computer("HP","Window 10",4);
		c1.display();
	}

}
