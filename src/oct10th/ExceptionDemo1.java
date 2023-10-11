package oct10th;

import java.io.FileInputStream;
import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) throws InterruptedException   {
		
		
		System.out.println("Enter x value : ");
		
		Scanner input=new Scanner(System.in);
		
		int x=input.nextInt();
		
		System.out.println("Enter y value : ");
		
		int y=input.nextInt();
		
		Thread.sleep(3000);
		
		//new FileInputStream("D:\\xyz.txt");
		
		try
		{
		
		System.out.println("Quotient is "+x/y);
		
		System.out.println("Remainder after division "+x%y);
		}
		
		catch(ArithmeticException | NullPointerException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Please Enter Non-zero value for y");
		}
		
		catch(RuntimeException re)
		{
			
		}
		
		finally
		{
			System.out.println("In finally block..");
		}
		
		System.out.println("End of program...");
		

	}

}
