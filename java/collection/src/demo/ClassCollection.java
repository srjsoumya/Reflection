package demo;

import java.util.ArrayList;
import java.util.ListIterator;

class Book {
	String bName;
	String author;
	int page;

	public Book(String bName, String author, int page) {
		this.bName = bName;
		this.author = author;
		this.page = page;
	}

	public String toString() {
		return "Book Name:" + bName + " Author Name:" + author + " Page Number:" + page;

	}
}

public class ClassCollection {
	public static void main(String[] str) {
		Book b1 = new Book("Let's C", "Balagurusami", 450);
		Book b2 = new Book("Networking Theory", "Forozon", 560);
		Book b3 = new Book("The Alchemist", "Paulo Coelho", 440);
		Book b4 = new Book("The Power of your Subconscious Mind", "Joseph Murphy", 350);
		Book b5 = new Book("Believe in Yourself", "Dr. Joseph Murphy", 450);

		ArrayList<Book> list = new ArrayList<Book>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);

		ListIterator<Book> itr = list.listIterator();
		while (itr.hasNext()) {
			Book arg = (Book) itr.next();
			System.out.println(arg);
		}
		System.out.println();
		while (itr.hasPrevious()) {
			Book arg = (Book) itr.previous();
			System.out.println(arg);
		}

	}

}
