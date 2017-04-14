
public class poly2 extends Polymorphism {

	public void area(int l, int b)
	{
		System.out.println("poly2");
	}

	public static void main(String args[])
	{
		Polymorphism a=new poly2();
		a.area(2,3);
		a.area(5);
	}
}
