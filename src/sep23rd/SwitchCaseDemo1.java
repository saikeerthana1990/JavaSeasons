package sep23rd;

import java.util.Scanner;

public class SwitchCaseDemo1 {

	public static void main(String[] args) {
		
		System.out.println("Enter Date : ");
		Scanner input1=new Scanner(System.in);
		int date=input1.nextInt();
		
		System.out.println("Enter Month : ");
		Scanner input2=new Scanner(System.in);
		int month=input2.nextInt();
		
		System.out.println("Enter Year : ");
		Scanner input3=new Scanner(System.in);
		int year=input3.nextInt();
		
		System.out.format("%02d-%02d-%04d",date,month,year);
		
		
	}

}
