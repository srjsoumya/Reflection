package programs;

import java.util.ArrayList;
public class CollectionSize {
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		int i=0;
		try
		{
			while(true)
			{
				arr.add(i);
				System.out.println(i);
				System.out.println(arr.size());
				arr.addAll(arr);
				i++;
			}
		}
		catch(Throwable e)
		{
			System.out.println(arr.size());
			System.out.println(i);
			System.out.println(e);
		}
		
	}

}
