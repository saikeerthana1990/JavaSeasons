package sep28th;

public class AbstractDemo1 {

	public static void main(String[] args) {
		
		
		// new Numbers();  //Cannot instantiate the type Numbers
		
		Numbers obj=new Sum();
		
		obj.compute(20, 10);
		obj.greet();
 
	}

}
