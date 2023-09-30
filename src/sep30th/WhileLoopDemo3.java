package sep30th;

import java.util.Scanner;

public class WhileLoopDemo3 {

	public static void main(String[] args) {
	
		
		while(true)
		{
			
			System.out.println("Enter some int : ");
			
			Scanner input=new Scanner(System.in);
			
			//char ch=input.next().charAt(0);
			
			int ch=input.nextInt();
			
			if(ch!=0 || ch!=100)
			{
				System.out.println("you have entered "+ch);
			}
			else
			{
				System.out.println("0 entered terminating ...");
				break;
			}
			
		}

	}

}
