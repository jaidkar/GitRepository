/**
 * 
 */
package ca.companyname.assignment_2_3_3;

/**
 * @author Ritika Jaidka
 *
 */
public class Student {
	
	int studentId ;
	char studentType;
	
	void setStudentId (int id)
	{
		studentId = id;
	}
	void setStudentType (char type)
	{
		studentType = type;
	}
	int getStudentId()
	{
		return studentId;   
	}
	
	char getStudentType()
	{
		return studentType;
	}

}
