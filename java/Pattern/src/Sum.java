public class Sum
{public static void main(String args[])
	{
		int no=3456;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum+=rem;
			no/=10;
		}
		System.out.println(sum);
	}
}
