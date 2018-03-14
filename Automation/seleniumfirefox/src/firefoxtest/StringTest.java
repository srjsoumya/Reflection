package firefoxtest;

public class StringTest {
	public static void main(String[] args) {
		int no=131;
		int temp=no;
		int res=0;
		while(no>0)
		{
			int rem=no%10;
			res=res*10+rem;
			no/=10;
		}
		
		if(temp==res)
			System.out.println("p");
		else
			System.out.println("np");
		}

}
