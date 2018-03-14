package programs;
interface Computer
{
	void start();
	void openFile();
	void closeFile();
	void shutdown();
}
class Laptop implements Computer
{
	public void start() 
	{
		System.out.println("Power bottom pressed");
		System.out.println("Loptop Started");	
	}	
	public void openFile() 
	{
		System.out.println("File clicked");
		System.out.println("File opened");
	}	
	public void closeFile() 
	{
		System.out.println("File closed");
	}
	public void shutdown() 
	{
		System.out.println("System shutdown");
		System.out.println("Laptop turned off");	
	}
}
public class TestInterface 
{
	public static void main(String args[])
	{
		Laptop hp=new Laptop();
		hp.start();
		hp.openFile();
		hp.closeFile();
		hp.shutdown();
	}

}
