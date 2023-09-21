package sep20th;

public class MethodsDemo3 {

	public static void main(String[] args) {
		
		MethodsDemo3 obj1=new MethodsDemo3();
		
		System.out.println(obj1.natSum(5));
		
		System.out.println(obj1.natSum(10));
		
		System.out.println(obj1.natSum(100));
		
		System.out.println(obj1.natSum(1000));

	}
	
	public int natSum(int n)
	{
		//int res=n*(n+1)/2;
		
		return n*(n+1)/2;
		
	}

}
