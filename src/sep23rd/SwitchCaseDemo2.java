package sep23rd;

import java.util.Scanner;

public class SwitchCaseDemo2 {

	public static void main(String[] args) {
		
		System.out.println("Enter Date : ");
		Scanner input1=new Scanner(System.in);
		int date=input1.nextInt();
		
		System.out.println("Enter Month : ");
		Scanner input2=new Scanner(System.in);
		int month=input2.nextInt();
		
		String mon=null;
		
		if(month == 1)
		{
			mon="JAN";
		}
		else if(month == 2)
		{
			mon="FEB";
		}
		else if(month == 3)
		{
			mon="MAR";
		}
		else if(month == 4)
		{
			mon="APR";
		}
		else if(month == 5)
		{
			mon="MAY";
		}
		else if(month == 6)
		{
			mon="JUN";
		}
		else if(month == 7)
		{
			mon="JUL";
		}
		else if(month == 8)
		{
			mon="AUG";
		}
		else if(month == 9)
		{
			mon="SEP";
		}
		else if(month == 10)
		{
			mon="OCT";
		}
		else if(month == 11)
		{
			mon="NOV";
		}
		else if(month == 12)
		{
			mon="DEC";
		}
		
		System.out.println("Enter Year : ");
		Scanner input3=new Scanner(System.in);
		int year=input3.nextInt();
		
		
		//System.out.format("%02d-%02d-%04d",date,month,year);
		
		System.out.format("%02d-%s-%04d",date,mon,year);
	}

}
