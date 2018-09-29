package assignment_2_1;

public class Typecasting {

	public static void main(String[] args) {
		double discount = 10;
		double billamount = 100;
		
		billamount = (billamount - (billamount *(discount/100)));
		System.out.println(billamount);
	}

}
