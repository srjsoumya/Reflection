package qspider;
interface Rbi
{
	int SAVING_INTREST=4;
	int TAX=18;
	public abstract void homeLoan();
	public abstract void studyLoan();
	public abstract void personaloan();
	public abstract void display();
}
class Sbi implements Rbi
{
	int balance;
	int accountNo;
	String name;
	int HLoanAmt,SLoanAmt,PLoanAmt;
	double hTotal,sTotal,pTotal;
	public Sbi(int balance,int accountNo,String name,int HLoanAmt,int SLoanAmt,int PLoanAmt)
	{
		this.balance=balance;
		this.accountNo=accountNo;
		this.name=name;
		this.HLoanAmt=HLoanAmt;
		this.SLoanAmt=SLoanAmt;
		this.PLoanAmt=PLoanAmt;
		this.homeLoan();
		this.personaloan();
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
	public void personaloan() 
	{
		int pLoanInt=11;
		pTotal=PLoanAmt+(PLoanAmt*pLoanInt)/100;	
	}
	public void display()
	{
		System.out.println("Name of Customer : "+name);
		System.out.println("Account Number : "+accountNo);
		System.out.println("Saving Account Balance: "+balance);
		System.out.println("Monthly earned intrest : "+(balance*SAVING_INTREST/100));
		if(HLoanAmt!=0)
		    System.out.println("HomeLoan Amount : " +HLoanAmt+" Total home loan to pay : "+hTotal);
		if(SLoanAmt!=0)
			System.out.println("StudyLoan Amount : " +SLoanAmt+" Total home loan to pay : "+sTotal);
		if(PLoanAmt!=0)
			System.out.println("PersonalLoan Amount : " +PLoanAmt+" Total home loan to pay : "+pTotal);
		System.out.println();
	}
}
class Axis implements Rbi
{
	int balance;
	int accountNo;
	String name;
	int hLoanAmt,sLoanAmt,pLoanAmt;
	double hTotal,sTotal,pTotal;
	public Axis(int balance,int accountNo,String name,int hLoanAmt,int sLoanAmt,int pLoanAmt)
	{
		this.balance=balance;
		this.accountNo=accountNo;
		this.name=name;
		this.hLoanAmt=hLoanAmt;
		this.sLoanAmt=sLoanAmt;
		this.pLoanAmt=pLoanAmt;
		this.homeLoan();
		this.personaloan();
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
	public void personaloan() 
	{
		int pLoanInt=11;
		pTotal=pLoanAmt+(pLoanAmt*pLoanInt)/100;	
	}
	public void display()
	{
		System.out.println("Name of Customer : "+name);
		System.out.println("Account Number : "+accountNo);
		System.out.println("Saving Account Balance: "+balance);
		System.out.println("Monthly earned intrest : "+(balance*SAVING_INTREST/100));
		if(hLoanAmt!=0)
		    System.out.println("HomeLoan Amount : " +hLoanAmt+" Total home loan to pay : "+hTotal);
		if(sLoanAmt!=0)
			System.out.println("StudyLoan Amount : " +sLoanAmt+" Total home loan to pay : "+sTotal);
		if(pLoanAmt!=0)
			System.out.println("PersonalLoan Amount : " +pLoanAmt+" Total home loan to pay : "+pTotal);
		System.out.println();
	}
	
}
public class TestInterface {
	public static void main(String []args)
	{
		Sbi sbi1=new Sbi(10000,1234,"hello",10000,0,0);
		sbi1.display();
		Sbi sbi2=new Sbi(40000,5321,"blake",30000,42000,0);
		sbi2.display();
		Axis axis1= new Axis(20000,3456,"nick",10500,50000,3400);
		axis1.display();
		Axis axis2=new Axis(60400,7890,"slade",65000,0,3400);
		axis2.display();
		
	}
}
