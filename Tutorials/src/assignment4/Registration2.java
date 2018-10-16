/**
 * 
 */
package assignment4;

/**
 * @author Ritika Jaidka
 *
 */
public class Registration2 {

	private int registrationid;
	private double fees;
	int discount; //local variable   if i write inside the method then whey do i need to initialize
	
	public void setRegistrationId(int id)
	{
		this.registrationid = id;
	}
	
	public int getRegistrationiId()
	{
		return registrationid;
	}
	public void setFees(int branchId)
	{
		switch(branchId)
		{
		case 1001:
			this.fees = 25575.0;
			break;
		case 1002:
			this.fees = 15500.0;
			break;
		case 1003:
			this.fees = 33750.0;
			break;
		case 1004:
			this.fees = 8350.0;
			break;
		case 1005:
			this.fees = 20500.0;
			break;
		}
	}
	public double getFees()
	{
		return fees;
	}
	
	public void calculateFees(int marks)
	{
		
		if (marks>=85 && marks<=100)
		{
			discount = 12;
		}
		else if (marks>=75 && marks<=84)
		{
			discount = 7;
		}
		else if (marks>=65 && marks<=74)
		{
			discount = 0;
		}
		
		fees =  fees - fees*(discount * 0.01);
		
	}
}
