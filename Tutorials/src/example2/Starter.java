package example2;

public class Starter {

	public static void main(String[] args) {
		Billing bill = new Billing();
		int total = bill.calculateTotal(5, 7);
		System.out.println(total);
	}

}
