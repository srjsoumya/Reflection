package qspider;
class Login
{
	String userName;
	String password;
	String users;
	
	 Login(String userName,String password,String users)
	{
		this.userName=userName;
		this.password=password;
		this.users=users;
	}
}
class Manager extends Login
{	
	Manager(Login obj) {
		super(obj.userName, obj.password, obj.users);		
	}
	void display()
	{
		System.out.println("Type of user is : "+users);
		System.out.println("User has Admin right");
	}	
	void createProject()
	{
		System.out.println("New project created");
	}
}
class Employee extends Login
{	
	Employee(Login obj) {
		super(obj.userName, obj.password, obj.users);
	}
	void display()
	{
		System.out.println("Type of user is : "+users);
		System.out.println("User has no Admin right");
	}	
	void impCode()
	{
		System.out.println("Code is going on");
	}
}

public class LoginTest {
	public static void main(String args[])
	{
		Login user=new Login("Batman","*****","Manager");
		
		switch(user.users) {
		
		case "Manager":
		{
			user = new Manager(user);
			Manager man=(Manager)user;
			man.display();
			man.createProject();
			break;
		}
		case "Employee":
		{
			user = new Employee(user);
			Employee emp=(Employee)user;
			emp.display();
			emp.impCode();
			break;
		}
		}	
	}

}
