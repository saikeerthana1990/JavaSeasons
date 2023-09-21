package sep21st;

public class PersonDemo {

	public static void main(String[] args) {
		
		Person p1=new Person();
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.phone);
		p1.greet();
		
		p1.name="SivaMani";
		p1.age=35;
		p1.phone=9848022338L;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.phone);
		p1.greet();
		

	}

}
