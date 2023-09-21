package sep20th;

public class MethodsDemo2 {

	public static void main(String[] args) {
		
		MethodsDemo2 obj1=new MethodsDemo2();
		
		obj1.natSum(5);
		obj1.natSum(10);
		obj1.natSum(100);
		obj1.natSum(1000);
	}
	
	public void natSum(int n)
	{
				
		int res=n*(n+1)/2;
		
		System.out.println("Sum of "+n+" natural Numbers  is : "+res);
		
	}

}
