/**
 * 
 */
package assignment_2_2;

/**
 * @author Ritika Jaidka
 *
 */
public class Ticket_practice {
	
	private int startPoint;
	private int endPoint;
	private int ticketAmount;
	
	public Ticket_practice() {
		// TODO Auto-generated constructor stub
	}

	public Ticket_practice(int end, int start) 
	{
		this.endPoint = end;
		this.startPoint = start;
		
	}

	public int getStartPoint()
	{
		return startPoint;
	}
	public int getEndPoint()
	{
		return endPoint;
	}
	public int getTicketAmount()
	{
		return ticketAmount;
	}
	public boolean validateTravelPoints()
	{	
		if (endPoint>0 && startPoint>0)
		{
			if (endPoint > startPoint)
			{
				calculateTicketAmt(startPoint, endPoint);
				return true;
			}
			else
			{	
				System.out.println("Invalid");
				return false;
			}
		}
		else
		{
			
			return false;
		
		}
	}
	public void calculateTicketAmt(int startPoint, int endPoint)
	{
		this.ticketAmount =(endPoint - startPoint)*20;
		System.err.println("The amount of money to be paid: "+ getTicketAmount());
	}
}
