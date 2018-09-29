/**
 * 
 */
package assignment4;

/**
 * @author Ritika Jaidka
 *
 */
public class DemoReg2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Registration2 reg2 = new Registration2();
		reg2.setRegistrationId(2001);
		reg2.setFees(1002);
		reg2.calculateFees(79);
		System.err.println("Registration Id:"+ reg2.getRegistrationiId());
		System.err.println("Fees:"+reg2.getFees());
		

	}

}
