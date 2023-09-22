package sep22nd;

public class Bank {
	
	private double balance =10000.0;
	
	//public methods 
	// getters 
	
	public void getBalance(int pin)
	{
		//validation 
		
		if(pin == 3421)
		{
		System.out.println(balance);
		}
		else
		{
			System.out.println("Invalid pin ...");
		}
	}

	
	//setters
	
	public void setBalance(double deposit)
	{
		balance=balance+deposit;
	}
	
	
}
