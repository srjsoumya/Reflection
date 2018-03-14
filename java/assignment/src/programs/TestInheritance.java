package programs;
class Food
{
	String foodName;
	String foodTaste;
	int calories; 
}
class Fruit extends Food
{
	String color;
	String type;
	public Fruit(String foodName,String foodTaste,int calories,String color,String type)
	{
		this.foodName= foodName;
		this.foodTaste= foodTaste;
		this.calories= calories;
		this.color= color;
		this.type= type;		
	}
	public void display()
	{
		System.out.println("Food Name :"+foodName);
		System.out.println("Food taste :"+foodTaste);
		System.out.println("Food contain calories :"+calories);
		System.out.println("Food color :"+color);
		System.out.println("Food type :"+type);
	}
}
public class TestInheritance {
	public static void main(String []args)
	{
		Fruit f1=new Fruit("Apple","Sweet",78,"Red","withseed");
		f1.display();
		System.out.println();
		Fruit f2=new Fruit("Grape","sour",57,"White","seedless");
		f2.display();		
	}
}
