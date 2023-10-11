package oct11th;

import java.util.Scanner;

public class VoterRegistration {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Voter Registration ");
		
		System.out.println("Enter your age : ");
		
		Scanner input=new Scanner(System.in);
		
		int age=input.nextInt();
		
		if(age>=18)
		{
			System.out.println("Eligible for voting ..please proceed with registraion ");
		}
		else
		{
			try
			{
			throw new InvalidAgeException();
			}
			catch(InvalidAgeException e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("End of program ");
		
	}

}
