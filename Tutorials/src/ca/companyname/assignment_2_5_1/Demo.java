/**
 * 
 */
package ca.companyname.assignment_2_5_1;

/**
 * @author Ritika Jaidka
 *
 */
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Student student = new Student ();
		student.setStudentId(1001);
		student.setQualifyingExamMarks(95.0f);
		student.setResidentialStatus('D');
		student.setYearOfEngg(2);
		
		
		System.out.println("The student Id is "+student.getStudentId());
		System.out.println("The qualifying marks are "+student.getQualifyingExamMarks());
		System.out.println("The Residential status is " +student.getResidentialStatus());
		System.out.println("The current year of engineering " +student.getYearOfEngg());

	}

}
