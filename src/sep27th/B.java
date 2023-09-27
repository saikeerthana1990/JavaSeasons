package sep27th;

public class B extends A{
	
	int x;
	
	public void putX(int x)
	{
		this.x=x;
	}
	
	public void greet(String name)
	{
		System.out.println("Hey .."+name+"..whazaap ???");
	}
	public void showAll()
	{
		System.out.println("x is "+super.x);
		System.out.println("x is "+this.x);
		System.out.println("y is "+y);
		super.greet("John");
	}

}
