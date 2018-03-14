package programs;

interface Rbi
{
	int SAVING_INTREST=4;
	public abstract void homeLoan();
	public abstract void studyLoan();
	public abstract void display();
}
class Sbi implements Rbi
{
	int balance;
	String name;
	int HLoanAmt,SLoanAmt;
	double hTotal,sTotal;
	public Sbi(int balance,String name,int HLoanAmt,int SLoanAmt)
	{
		this.balance=balance;
		this.name=name;
		this.HLoanAmt=HLoanAmt;
		this.SLoanAmt=SLoanAmt;
		this.homeLoan();
		this.studyLoan();
	}	
	public void homeLoan() 
    {
		int hLoanInt=12;
		hTotal=HLoanAmt+(HLoanAmt*hLoanInt)/100;
	}
	public void studyLoan() 
	{
		int sLoanInt=10;
		sTotal=SLoanAmt+(SLoanAmt*sLoanInt)/100;	
	}	
	public void display()
	{
		System.out.println("Name of Customer : "+name);
		System.out.println("Saving Account Balance: "+balance);
		System.out.println("Monthly earned intrest : "+(balance*SAVING_INTREST/100));
		if(HLoanAmt!=0)
		    System.out.println("HomeLoan Amount : " +HLoanAmt+" Total home loan to pay : "+hTotal);
		if(SLoanAmt!=0)
			System.out.println("StudyLoan Amount : " +SLoanAmt+" Total home loan to pay : "+sTotal);
		System.out.println();
	}
}
class Axis implements Rbi
{
	int balance;
	String name;
	int hLoanAmt,sLoanAmt;
	double hTotal,sTotal;
	public Axis(int balance,String name,int hLoanAmt,int sLoanAmt)
	{
		this.balance=balance;
		this.name=name;
		this.hLoanAmt=hLoanAmt;
		this.sLoanAmt=sLoanAmt;
		this.homeLoan();
		this.studyLoan();
	}	
	public void homeLoan() 
    {
		int hLoanInt=10;
		hTotal=hLoanAmt+(hLoanAmt*hLoanInt)/100;
	}
	public void studyLoan() 
	{
		int sLoanInt=8;
		sTotal=sLoanAmt+(sLoanAmt*sLoanInt)/100;	
	}	
	public void display()
	{
		System.out.println("Name of Customer : "+name);
		System.out.println("Saving Account Balance: "+balance);
		System.out.println("Monthly earned intrest : "+(balance*SAVING_INTREST/100));
		if(hLoanAmt!=0)
		    System.out.println("HomeLoan Amount : " +hLoanAmt+" Total home loan to pay : "+hTotal);
		if(sLoanAmt!=0)
			System.out.println("StudyLoan Amount : " +sLoanAmt+" Total home loan to pay : "+sTotal);
		System.out.println();
	}	
}
public class TestHeirarchyInterface {
	public static void main(String []args)
	{
		Sbi sbi1=new Sbi(10000,"hello",10000,0);
		sbi1.display();
		Sbi sbi2=new Sbi(40000,"blake",30000,42000);
		sbi2.display();
		Axis axis1= new Axis(20000,"nick",10500,50000);
		axis1.display();
		Axis axis2=new Axis(60400,"slade",65000,0);
		axis2.display();		
	}
}