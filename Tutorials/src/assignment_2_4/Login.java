package assignment_2_4;
//Understand an array of string
public class Login 
{
//	static String usernames;
//	static String passwords;
	String username;
	String password;
	static String[] usernames = {"admin", "finance","student"};
	static String [] passwords = {"Admin","Finance","Student"};

	public Login ()
	{}
	public  Login(String user, String pass )   //constructor ->the main rule of the constructor is that it has the
	//same name as the class. 
	{
		this.username=user;
		this.password = pass;
	}
	
	public boolean validateLogin()
	{
		for(int i=0;i<usernames.length;i++)
		{
			if (usernames[i].equals(username))
			{
				if(passwords[i].equals(password))
				{
					System.out.println("Login Successful");
					//System.err.println(i);
					return true;
				}
			}
			
		}
		System.out.println("Login Denied");
		return false;
		
	}
}
