/**
 * 
 */
package ca.companyname.assignment_2_3_3;

/**
 * @author Ritika Jaidka
 *
 */
public class CourseManagement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student ();
		student.setStudentId(5);
		student.setStudentType('R');
		
		System.out.println("This is student id"+student.getStudentId());
		System.out.println("This is student type"+student.getStudentType());

	}

}
