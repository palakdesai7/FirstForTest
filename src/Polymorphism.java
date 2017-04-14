public class Polymorphism{
	
	public void area(int l)
	{
		
	}
	
	public void area(int l, int b)
			{
				System.out.println("polyrpshm");
			}
	
	
	
	public static void main(String args[])
	{
		//area(5);
		Polymorphism p= new Polymorphism();
		p.area(2, 3);
	}
	
}
