/**
 * 
 */
package ca.companyname.assignment_2_5_1;

/**
 * @author Ritika Jaidka
 *
 */
public class Student {
	
	int studentId;
	float qualifyingExamMarks;
	char residentialStatus;
	int yearOfEngg;
	
	
	void setStudentId (int id)
	{
		studentId = id;
	}
	void setQualifyingExamMarks (float marks)
	{
		qualifyingExamMarks = marks;
	}
	
	void setResidentialStatus (char status)
	{
		residentialStatus = status;
	}
	
	void setYearOfEngg (int year)
	{
		yearOfEngg = year;
	}
	
	int getStudentId ()
	{
		return studentId;
	}
	
	float getQualifyingExamMarks ()
	{
		return qualifyingExamMarks;
	}
	
	char getResidentialStatus ()
	{
		return residentialStatus;
	}
	
	int getYearOfEngg ()
	{
		return yearOfEngg;
	}
}
