package programs;
class Registration
{
	String uName,passWord;
	int pNumber;
	String type,location;
	public Registration(String uName,String passWord,int pNumber)
	{
		this.uName= uName;
		this.passWord= passWord;
		this.pNumber= pNumber;
	}
	public Registration(String uName,String passWord,int pNumber,String type,String location)
	{
		this(uName, passWord, pNumber);
		this.type= type;
		this.location=location;
	}
	public void display()
	{
		System.out.println("Usename: "+uName);
		System.out.println("Password: "+passWord);
		System.out.println("Phonenumber: "+pNumber);
		if(type!=null)
		System.out.println("User type: "+type);
		if(location!=null)
		System.out.println("location: "+location);
	}
	
}

public class ChainingThis {
	public static void main(String []args)
	{
		Registration person1=new Registration("Batman","wayne",909090909,"Admin","Gotham");
		person1.display();
		System.out.println();
		Registration person2=new Registration("Aquaman","Atlantis",1000000);
		person2.display();
		
	}

}
