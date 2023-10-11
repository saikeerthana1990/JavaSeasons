package oct11th;

public class InvalidAgeException extends RuntimeException  {
	
	public InvalidAgeException()
	{
		super("Invalid age ..please register once you reach 18");
	}

}
