package demo;

import java.util.ArrayList;
import java.util.ListIterator;

class Novel {
	String bName;
	String author;
	int page;

	public Novel(String bName, String author, int page) {
		this.bName = bName;
		this.author = author;
		this.page = page;
	}

	public String toString() {
		return "Book Name:" + bName + "; Author Name:" + author + "; Page Number:" + page;

	}
}

class Car {
	String cName;
	String ComName;
	int power;

	public Car(String cName, String ComName, int power) {
		this.cName = cName;
		this.ComName = ComName;
		this.power = power;
	}

	public String toString() {
		return "CarName:" + cName + "; CompanyName: " + ComName + "; power: " + power;
	}
}

public class ArrayClassList {
	public static void display(Object[] obj) {
		for (Object i : obj)
			System.out.println(i);
		System.out.println();

	}

	public static void main(String[] args) {
		Novel b1 = new Novel("Let's C", "Balagurusami", 450);
		Novel b2 = new Novel("Networking Theory", "Forozon", 560);
		Novel b3 = new Novel("The Alchemist", "Paulo Coelho", 440);
		Novel b4 = new Novel("The Power of your Subconscious Mind", "Joseph Murphy", 350);
		Novel b5 = new Novel("Believe in Yourself", "Dr. Joseph Murphy", 450);

		Novel[] book = { b1, b2, b3, b4, b5 };

		Car c1 = new Car("AMG", "MERCEDES", 6400);
		Car c2 = new Car("MERCILAGO", "LAMBERGINI", 6800);
		Car c3 = new Car("M5GT", "BMW", 5400);
		Car c4 = new Car("DB9", "ASTORN MARTIN", 5300);

		Car[] car = { c1, c2, c3, c4 };

		ArrayList<Object[]> list = new ArrayList<Object[]>();
		list.add(book);
		list.add(car);

		ListIterator<Object[]> itr = list.listIterator();
		while (itr.hasNext()) {
			Object[] arg = (Object[]) itr.next();
			display(arg);
		}
		System.out.println();

	}

}
