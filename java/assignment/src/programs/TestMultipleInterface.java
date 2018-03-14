package programs;
interface House
{
	public abstract void eat();
	public abstract void watch();
	public abstract void sleep();
}
interface College
{
	public abstract void study();
	public abstract void experiment();
	public abstract void exam();	
}
class Person implements House,College
{

	public void study() 
	{
		System.out.println("Studing Java");	
	}
	public void experiment() 
	{
		System.out.println("Doing experiment on Java");
	}
	public void exam() 
	{
		System.out.println("Giving exam on Java ");
	}
	public void watch() 
	{
		System.out.println("Watching movie on Tv");
	}
	public void sleep() 
	{
		System.out.println("Sleeping zzzz");
	}
	public void eat() 
	{
		System.out.println("Eating snacks");		
	}	
}

public class TestMultipleInterface 
{
	public static void main(String args[])
	{
		Person p1=new Person();
		p1.eat();
		p1.study();
		p1.experiment();
		p1.exam();
		p1.watch();
		p1.sleep();
	}
	

}
