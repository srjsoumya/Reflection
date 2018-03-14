package programs;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList <Integer> arr=new ArrayList <Integer>(10);
		arr.add(50);
		arr.add(60);
		arr.add(30);
		//arr.trimToSize();
		System.out.println(arr.size());
		arr.add(80);
		
		for(int i:arr)
		{
			System.out.println(i);
		}

	}
}
