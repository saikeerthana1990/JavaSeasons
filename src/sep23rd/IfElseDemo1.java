package sep23rd;

public class IfElseDemo1 {

	public static void main(String[] args) {
		
		int sal=40000;
		
		if(sal <= 30000)
		{
			sal = sal + (sal*10)/100;
		}
		else
		{
			sal = sal + (sal*20)/100;
		}
		
		System.out.println("New Salary "+sal);

	}

}
