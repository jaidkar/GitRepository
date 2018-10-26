/**
 * 
 */
package ca.companyname.assignment_2_6_2;

/**
 * @author Ritika Jaidka
 *
 */
public class Checks 
{

	boolean checkBaggage (Traveller traveller)
	{
		if (traveller.baggageAmount >=0 && traveller.baggageAmount<=40)
		{
				return true;
		}
		else return false;
		
		
	}

	boolean checkImmigration (Traveller traveller)
	{
		if (traveller.expiryYear >= 2001 && traveller.expiryYear<=2025)
		return true;
		else return false;
		
	}
	
	boolean checkSecurity (Traveller traveller)
	{
		if (traveller.nocStatus == true)
		{
		return true;
		}
		else return false;
	}
}
