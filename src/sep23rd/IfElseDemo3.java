package sep23rd;

import java.util.Scanner;

public class IfElseDemo3 {

	public static void main(String[] args) {
		
		System.out.println("Enter your Salary : ");
		
		//int sal=40000;
		
		Scanner input=new Scanner(System.in);
		int sal = input.nextInt();
		
		System.out.println("Enter your Dept(IT or NIT : ");
		Scanner input2=new Scanner(System.in);
		String dept=input2.next();
		
		if(sal <= 30000)
		{
			if(dept.equals("NIT"))
			{
			sal = sal + (sal*10)/100;
			}
			else
			{
				sal = sal + (sal*15)/100;
			}
			
		}
		else if(sal > 30000 && sal <= 50000)
		{
			sal = sal + (sal*20)/100;
		}
		else 
		{
			sal = sal + (sal*30)/100;
		}
		
		
		System.out.println("New Salary "+sal);

	}

}
