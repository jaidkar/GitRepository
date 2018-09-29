/**
 * 
 */
package assignement_2_5;

/**
 * @author Ritika Jaidka
 *
 */
public class EmailCheck {
	
String emailId;
	public EmailCheck()
	{}
	public EmailCheck(String email)
	{
		this.emailId = email;
	}
	public String getEmailId()
	{
		return emailId;
	}
	public void setEmailId()
	{
		
	}
	public String validateEmail()
	{
		if (emailId.length()>3 && emailId.length()<20)
		{
				if (emailId.indexOf("@")==1 && emailId.indexOf(".")==1)
				{
					
				}
			
		}
		
		return emailId;
	}

}
