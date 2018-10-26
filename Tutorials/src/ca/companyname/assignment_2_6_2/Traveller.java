/**
 * 
 */
package ca.companyname.assignment_2_6_2;

/**
 * @author Ritika Jaidka
 *
 */
public class Traveller {
	
	int travellerId;
	int baggageAmount;
	int expiryYear;
	boolean nocStatus;
	public Traveller()
	{
		
	}
	void setTravellerId (int travelId)
	{
		travellerId= travelId;
	}
	
	void setBaggaeAmount(int baggageAmt)
	{
		baggageAmount = baggageAmt;
	}
	
	void setExpiryYear(int expiryYr)
	{
		expiryYear = expiryYr;
	}
	void setnocStatus(boolean status)
	{
		nocStatus = status; 
	}
	void getTravellerId(int travellerId)
	{
		
	}
	int getExpiryYear()
	{
		return expiryYear;
	}
	boolean setnocStatus()
	{
		return setnocStatus();
	}
	
}
