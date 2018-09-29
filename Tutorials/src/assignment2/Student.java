package assignment2;

public class Student {
	
	public boolean validateExamMarks(int qualifyingExamMarks)
	
	{
		
		if (qualifyingExamMarks >=65 && qualifyingExamMarks <= 100)
				{
			System.err.println("Valid Marks");
			return true;
				}	
		else
		{
			System.out.println("Invalid Marks. The Range of qualifying exam marks is between 65 and 100");
			return false;
		}
			
	}

}
