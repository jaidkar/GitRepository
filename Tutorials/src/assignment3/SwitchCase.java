package assignment3;

public class SwitchCase {

	public static void main(String[] args) {
		
		String letter="C";
				
		switch (letter)
		 {
		case "A":
			System.out.println("Range of Marks is 80-100");
			break;
		case "B":
			System.out.println("Range of Marks is 73-79");
			break;
		case "C": 
			System.out.println("Range of Marks is 65-72");
			break;
		case "D":
			System.out.println("Range of Marks is 55-64");
			break;
		case "E":
			System.out.println("Range of Marks is <55");
			break;
		default:
			System.out.println("Grade does not exist");
			break;
		 }
		
	

		
	}

}
