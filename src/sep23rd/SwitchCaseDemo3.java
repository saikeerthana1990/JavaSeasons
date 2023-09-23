package sep23rd;

import java.util.Scanner;

public class SwitchCaseDemo3 {

	public static void main(String[] args) {

		System.out.println("Enter Date : ");
		Scanner input1 = new Scanner(System.in);
		int date = input1.nextInt();

		System.out.println("Enter Month : ");
		Scanner input2 = new Scanner(System.in);
		int month = input2.nextInt();
		//float month=input2.nextFloat();

		String mon = null;

		switch (month) {

		case 1:
			mon = "JAN";
			break;
		case 2:
			mon = "FEB";
			break;
		case 3:
			mon = "MAR";
			break;
		case 4:
			mon = "APR";
			break;
		case 5:
			mon = "MAY";
			break;
		case 6:
			mon = "JUN";
			break;
		case 7:
			mon = "JUL";
			break;
		case 8:
			mon = "AUG";
			break;
		case 9:
			mon = "SEP";
			break;
		case 10:
			mon = "OCT";
			break;
		case 11:
			mon = "NOV";
			break;
		case 12:
			mon = "DEC";
			break;
		default : 
			System.out.println("Invalid Month Entered ");

		}

		System.out.println("Enter Year : ");
		Scanner input3 = new Scanner(System.in);
		int year = input3.nextInt();

		// System.out.format("%02d-%02d-%04d",date,month,year);

		System.out.format("%02d-%s-%04d", date, mon, year);
	}

}
