package demo;

import java.util.*;

public class ArrayListTest {
	static void display(Object[] arr) {
		System.out.print("{ ");
		for (Object i : arr) {
			System.out.print(i + " ");
		}
		System.out.print(" }");
	}

	public static void main(String[] args) {

		ArrayList<Object[]> list = new ArrayList<Object[]>();
		Integer[] a = { 1, 2, 3, 4, 5 };
		Character[] b = { 'a', 'b', 'c', 'd', 'e', 'f' };
		Double[] c = { 10.5, 20.5, 30.5, 40.5 };
		list.add(a);
		list.add(b);
		list.add(c);
		Iterator<Object[]> itr = list.iterator();
		while (itr.hasNext()) {
			Object[] arr = (Object[]) itr.next();
			display(arr);
			System.out.println();
		}

	}

}
