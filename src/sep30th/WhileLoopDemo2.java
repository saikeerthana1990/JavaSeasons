package sep30th;

import java.util.Scanner;

public class WhileLoopDemo2 {

	public static void main(String[] args) {
	
		
		while(true)
		{
			
			System.out.println("Enter some character : ");
			
			Scanner input=new Scanner(System.in);
			
			char ch=input.next().charAt(0);
			
			if(ch == 'x' || ch=='X')
			{
				System.out.println("x entered terminating ...");
				break;
			}
			else
			{
				System.out.println("you have entered character : "+ch);
			}
			
		}

	}

}
